import Link from "next/link";

export default function BlogPage(){
    return(
        <div>
            블로그 페이지
            <br></br>
            <Link href='blog/page-1'>게시글1</Link>
            <br></br>
            <Link href='blog/page-2'>게시글2</Link>
        </div>
    )
}