import ActiveitesGrid from "@/components/activities/activities-grid";
import { connectDB } from "@/util/db";
import Link from "next/link";
import styles from './page.module.css';
import { resolve } from "styled-jsx/css";

export default async function GroupPage(){

    //db내용을 전부 조회해서 객체 배열로 변수에 저장
    const db = (await connectDB).db('mydb');
    let activeites = await db.collection('group').find().toArray();

    await new Promise(resolve=>setTimeout(resolve, 1500)) //1.5초 대기

    // 몽고디비의 특성상 _id를 컴포넌트끼리 전달을 할 수 없기 때문에 string으로 바꿔서 전해준다
    activeites = activeites.map((item, idx)=>({
        ...item,
        _id : item._id.toString()
    }))
    // console.log(activeites)

    return(
        <div>
            <header className={styles.header}>
                <h1>동아리 활동 게시글</h1>
                <p className={styles.highlight}>
                    <Link href="/group/share">활동 공유</Link>
                </p>
            </header>
            <main className={styles.cta}>
                {/* 게시글을 보여주는 컴포넌트 */}
                <ActiveitesGrid activeites={activeites}/>
            </main>
        </div>
    )
}

// 리액트에서는 URL변경을 위해서
// <a></a>태그를 사용하지 않고 (새로고침방지)
// Link 컴포넌트를 이용