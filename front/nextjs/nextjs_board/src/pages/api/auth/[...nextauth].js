import NextAuth from 'next-auth';
import GitHubProvider from 'next-auth/providers/github'; // 구글 로그인
import GoogleProvider from 'next-auth/providers/google'; // 깃허브 로그인
import CredentialsProvider from 'next-auth/providers/credentials'; // db로그인
import bcrypt from 'bcrypt';
import { connectDB } from '@/util/db';

export const authOptions = {
  providers: [
    GitHubProvider({
      clientId: '',
      clientSecret: '',
    }),
    GoogleProvider({
      clientId: '',
      clientSecret: '',
    }),
    CredentialsProvider({
      // 아이디 및 비밀번호 로그인
      name: "credentials",
      credentials:{
        email: {label:"email", type:"text"},
        password:{label:"password", type:"password"},
      },

      // 로그인 시도 시
      async authorize(credentials){
        let db = (await connectDB).db('mydb');
        let user = await db.collection('user').findOne({email:credentials.email});    // 이메일 있는지 확인
        if(!user){
          console.log('일치하는 이메일이 없습니다.');
          return null;
        }

        const passwordCheck = await bcrypt.compare(credentials.password, user.password);    // 비밀번호 일치하는지 비교
        if(!passwordCheck){
          console.log('비밀번호가 일치하지 않습니다');
          return null;
        }
        return user;
      }
    })    
  ],
  session:{
    strategy:'jwt',
    maxAge: 24* 60* 60     // 1일(로그인 유지 기간)
  },
  callbacks:{
    jwt: async ({token, user}) =>{
      if(user){
        token.user = {};
        token.user.name = user.name;
        token.user.email = user.email;
      }
      return token;
    },
    session: async({session, token})=>{
      session.user = token.user;      // 토큰 정보 조회
      return session;
    }
  },
  secret: 'anything',
  
};

export default NextAuth(authOptions);


// npm install next-auth
// pages 폴더 안에 api 폴더 안에 auth 폴더를 생성하고 [...nextauth].js 파일 생성

// 깃허브 로그인 -> 우측아이콘 -> Settings -> Developer settings -> OAuth Apps -> Register a new application
// -> Application name 입력, http://localhost:3000/ 입력 (실제 사이트면 실제사이트 URL 입력)
// -> Generate a new client secret 버튼 클릭




// https://console.cloud.google.com/ -> API 및 서비스 -> OAuth 동의 화면 (External 버튼)
// 사용자 인증 정보 -> OAuth 2.0 클라이언트 생성 -> 웹 애플리케이션 -> 이름 -> 승인된 리디렉션 URI 추가(http://localhost:3000/api/auth/callback/google)

// 구글




