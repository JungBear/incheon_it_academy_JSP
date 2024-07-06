const {MongoClient} = require('mongodb');

const initData = [
    {
        title: '한국의 전통 음식',
        slut: 'korean-traditional-food',
        image: '/images/photo1.jpg',
        summary: '한국의 대표적인 전통 음식인 김치에 대해 알아보자.',
        content: '김치는 한국의 대표적인 발효 음식으로, 다양한 채소를 소금에 절여 발효시킨 음식이다.',
        creator: '홍길동',
        creator_email: 'honggildong@example.com'
    },
    {
        title: '한국의 사계절',
        slut: 'korean-four-seasons',
        image: '/images/photo1.jpg',
        summary: '한국의 아름다운 사계절을 소개합니다.',
        content: `한국은 봄, 여름, 가을, 겨울의 사계절이 뚜렷한 나라로,
                 각 계절마다 아름다운 풍경을 자랑합니다.`,
        creator: '김철수',
        creator_email: 'kimcheolsu@example.com'
    },
    {
        title: '한류 열풍',
        slut: 'hallyu-wave',
        image: '/images/photo1.jpg',
        summary: '전 세계를 휩쓴 한류 열풍의 원인과 현상을 분석해보자.',
        content: '한류는 한국의 대중문화가 전 세계적으로 인기를 끌며 많은 팬들을 보유하게 된 현상을 말합니다.',
        creator: '이영희',
        creator_email: 'leeyounghee@example.com'
    },
    {
        title: '서울의 명소',
        slut: 'seoul-attractions',
        image: '/images/photo1.jpg',
        summary: '서울에서 꼭 가봐야 할 명소들을 소개합니다.',
        content: '서울에는 경복궁, 남산타워, 명동 등 많은 관광 명소들이 있습니다.',
        creator: '박지성',
        creator_email: 'parkjisung@example.com'
    },
    {
        title: '한국의 전통 의상',
        slut: 'korean-traditional-clothes',
        image: '/images/photo1.jpg',
        summary: '한국의 아름다운 전통 의상인 한복에 대해 알아보자.',
        content: '한복은 한국의 전통 의상으로, 고유의 아름다움과 우아함을 자랑합니다.',
        creator: '최수현',
        creator_email: 'choisuhyun@example.com'
    },
    {
        title: '한국의 전통 놀이',
        slut: 'korean-traditional-games',
        image: '/images/photo1.jpg',
        summary: '한국의 전통 놀이와 그 역사에 대해 알아봅시다.',
        content: '윷놀이, 제기차기, 팽이치기 등은 한국의 대표적인 전통 놀이들입니다.',
        creator: '정민호',
        creator_email: 'jungminho@example.com'
    }
];

async function connectDB(){
    // const url = 'mongodb+srv://admin:admin@cluster0.0t9wkx9.mongodb.net/?retryWrites=true&w=majority';
    const url = "mongodb+srv://admin:admin@cluster0.lh0lafl.mongodb.net/?retryWrites=true&w=majority";
    const options = {};
    let connectDB;

    if(process.env.NODE_ENV === 'development'){
        if(!global._mongo){
            global._mongo = new MongoClient(url, options).connect()
        }
        return connectDB = global._mongo
    }else{
        return connectDB = new MongoClient(url, options).connect()
    }

}

async function insertDummyData(){
    const client = await connectDB();
    const db = client.db('mydb'); // database 이름으로 입력
    const collection = db.collection('group'); // 컬렉션 이름을 입력

    const result = await collection.insertMany(initData); // 객체 배열을 전부 입력

    console.log(`${result} 입력`)

}

insertDummyData();
