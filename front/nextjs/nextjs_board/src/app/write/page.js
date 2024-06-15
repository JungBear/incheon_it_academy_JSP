export default async function Write(){

    
    
    return(
        <div>
            <h4>글 작성 페이지</h4>
            
            {/* /api/test에 POST요청 */}
            <form action="/api/post/new" method="POST">
                <input name="title" placeholder="제목을 입력하세요"/>
                <br/>
                <input name="content" placeholder="내용을 입력하세요"/>
                <br/>
                <button type="submit">POST요청 버튼</button>
            </form>

            {/* /api/test에 get요청 */}
            <form action="/api/test" method="GET">
                <button type="submit">GET요청 버튼</button>
            </form>
        </div>
    )
}