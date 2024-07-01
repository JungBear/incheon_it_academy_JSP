import Link from "next/link";

export default function Group(){
    return(
        <div>

            <h1>동아리 게시글</h1>
            <p><Link href="/group/post-1">게시글 1</Link></p>
            <p><Link href="/group/post-2">게시글 2</Link></p>
        </div>
    )
}