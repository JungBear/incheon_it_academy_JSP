import Image from "next/image";
import styles from "./page.module.css";
import Link from "next/link";
import Header from "@/components/header/header";

// blog라는 경로 추가
//
export default function Home() {
  return (
    <div>
      <Link href="/about">어바웃 페이지로 이동</Link>
      <br/>
      <Link href="/blog">블로그 이동</Link>
    </div>
  );
}
