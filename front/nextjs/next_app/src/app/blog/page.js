import Link from "next/link";

export default function Blog(){
    return(
        <>
            <h1>블로그 페이지</h1>
            <p><Link href="/blog/post-1">게시글1</Link></p>
            <p><Link href="/blog/post-2">게시글2</Link></p>
        </>
    )
}
// 하나의 블로그에는 무수한 많은 게시글이 있을 수 있다
// 하나하나 url로 만들어 줄 수 없다
// => 동적 URL
//[slug]