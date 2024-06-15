import { connectDB } from "@/util/db";
import { ObjectId } from "mongodb";

export default async function Detail({params}){
    
    const db = (await connectDB).db("mydb") // 데이터 베이스 이름
    let result = await db.collection('post').findOne({_id : ObjectId.createFromHexString(params.slug)});  

    console.log(result)
    return(
        <div>
            <h4>상세페이지</h4>
            <h4>{result.title}</h4>
            <p>{result.content}</p>
        </div>
    )
}