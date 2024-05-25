import Link from "next/link";
import "./header.css";

export default function Header(){
    return(
        <header>
            <Link href ='/'><h3>홈</h3></Link>

            <nav>
                <ul>
                    <li><Link href='/about'>About</Link></li>
                    <li><Link href='/blog'>블로그</Link></li>
                </ul>
            </nav>

        </header>
    )
}