import { headers } from 'next/headers';
import './header.css';
import Link from 'next/link';
import HeadBackground from './header-background';
import logoImg from '@/assets/logo.png';
import Image from 'next/image';

export default function Header(){
    return(
        <>
            <HeadBackground />
            <header>
                <Link href ="/">
                    {/* <img src={logoImg.src}  alt='img'/> */}
                    <Image src={logoImg} />
                </Link>

                <nav>
                    <ul>
                        <li>
                            <Link href="/blog">블로그</Link>
                        </li>
                        <li>
                            <Link href="/about">About</Link>
                        </li>
                    </ul>
                </nav>
            </header>
        </>
    )
}