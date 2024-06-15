import Image from "next/image";
import styles from "./page.module.css";
import { connectDB } from "@/util/db";

export default async function Home() {
const db = (await connectDB).db("mydb") // 데이터 베이스 이름
let result = await db.collection('post').find().toArray();
console.log(result)

  return (
    <div>
      <p>{result[0]?.title}</p>
      <p>{result[0]?.content}</p>
    </div>
  );
}
