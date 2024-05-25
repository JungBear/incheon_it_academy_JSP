// 로딩 게시글페이지마다 글이 달라야하니까
// 매개변수로 {params} 받는다

export default function BlogPostPage({params}){
    return(
        <>
            <h1>블로그 게시글</h1>
            <p>{params.slug}</p>
        </>
    )
}