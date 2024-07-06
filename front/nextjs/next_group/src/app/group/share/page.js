import ImagePicker from '@/components/activities/image-picker';
import styles from './page.module.css';

export default function SharePage(){
    return(
        <div>
            <header className={styles.header}>
                우리 동아리 <span className={styles.span}>활동 등록</span>
            </header>
            <main className={styles.main}>
                <form className={styles.form}>
                    <div className={styles.row}>
                        <p>
                            <label htmlFor='name'>이름</label>
                            <input type='text' id='name' name='name' required/>
                        </p>
                        
                        <p>
                            <label htmlFor='email'>이메일</label>
                            <input type='email' id='email' name='email' required/>
                        </p>
                    </div>

                        <p>
                            <label htmlFor='title'>제목</label>
                            <input type='text' id='title' name='title' required/>
                        </p>

                        <p>
                            <label htmlFor='summary'>요약</label>
                            <input type='text' id='summary' name='summary' required/>
                        </p>

                        <p>
                            <label htmlFor='content'>내용</label>
                            <textarea id='content' name='content' rows="10"></textarea>
                        </p>
                        <ImagePicker />
                        <p className={styles.actions}>
                            <button type='submit'>등록</button>
                        </p>
                </form>
            </main>
        </div>
    )
}