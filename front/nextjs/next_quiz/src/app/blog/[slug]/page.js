export default function PostPage({params}){
    return(
        <div>
            게시글 페이지입니다
            <br></br>
            {params.slug}
        </div>
    )
}