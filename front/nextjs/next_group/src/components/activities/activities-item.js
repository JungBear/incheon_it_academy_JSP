import Image from 'next/image';
import style from './activities-item.module.css';
import Link from 'next/link';

export default function ActiveitesItem({_id, title, slug, image, summary, content, creator, creator_email}){
    return(
        <div className={style.activities}>
            <header className={style.imgHeader}>
                <Image src={image} alt={title}fill/>
            </header>

            <div className={style.headerText}>
                <h2>{title}</h2>
                <p>작성자 : {creator}</p>
            </div>

            <div className={style.content}>
                <p className={style.summary}>{summary}</p>
                <div className={style.actions}>
                    <Link href={`/group/${_id}`}>자세히 보기</Link>
                </div>
            </div>
        </div>
    )
}