import { connectDB } from "@/util/db";

export default async function writeHandler(req, res){
    console.log(req.body);

    if(req.method == 'POST'){
        let {title, content} = req.body;
        if(title && content){
            try{
                const db = (await connectDB).db("mydb") // 데이터 베이스 이름
                let result = await db.collection('post').insertOne({title, content});  
                return res.redirect(302,'/list');
            }catch(error){
                console.log('Database Error : ' + error)
                return res.status(500).json({error : '서버 기능 오류'});
            }
        }else{
            return res.status(400).json({error:'빈칸은 허용되지 않습니다.'});
        }
 
        

    }else{
        return res.status(405).json({error:'Method Not Allowed'})
    }
}