// ScrollIndicator라는 컴포넌트를 만들어서
// App.js에 붙이기
import { useEffect, useState } from 'react';
import './scroll-indicator.css';

export default function ScrollIndicator({url}){

    // useEffect()에서 비동기로 fetch(get요청)
    // 서버에서 데이터를 받아옴
    // 1. 서버의 주소
    // 2. 데이터를 저장할 state
    // 3. fetch와 같은 오래 걸리는 작업을 처리할 useEffect()

    // 응답 데이터를 받아서 저장할 state
    // 상태 : 서버 데이터, 로딩체크, 에러, 스크롤 위치
    let [data, setData] = useState([]);
    let [loading, setLoading] = useState(false);
    let [errMsg, setErrMsg] = useState("");
    let [scrollPercentage, setScrollPercentage] = useState(0);
 

    async function fetchData(url){
        try {
            // 서버에 요청을 하기 전에 로딩 상태로 만든다
            setLoading(true);

            // get 요청
            let response = await fetch(url);
            // 응답받은 문자열을 json으로 인식
            const res_json = await response.json();
            
            setData(res_json.products); 
            // 잘 불러와서 저장까지 했으면 로딩상태 해제
            setLoading(false);
        } catch (e) {
            setErrMsg(e.message);
            console.log(e);
        }
       
        
    }

    

    // 사이드 기능(화면외) useEffect
    useEffect(()=>{
        // mount시 1번 실행
        if(url != ''){
            fetchData(url);
        }

        
        // url이 바뀔때 마다 실행(안적으면 )
    },[url])

    // 스크롤 이벤트 처리
    useEffect(()=>{
        window.addEventListener('scroll', changeScrollEvent);

        return(()=>{
            window.removeEventListener('scroll', changeScrollEvent);
        })
    },[]) // [] : update는 동작 안하게

    function changeScrollEvent(){
        // 스크롤의 위치를 감지
        // 현재 스크롤 위치
        let scrolled = document.documentElement.scrollTop;

        // 창이 작을수도 있으니까 현재 열려있는 창의 스크롤 범위를 계산
        // 스크롤 높이 - 클라이언트 높이 = 전체 스크롤 가능한 범위
        let height = document.documentElement.scrollHeight - document.documentElement.clientHeight;

        // (현재 ÷ 전체) * 100 : 퍼센트
       setScrollPercentage((scrolled / height) * 100);
    //    console.log("현재 스크롤 위치 : " + scrolled);
    //    console.log("높이 : " + height);
    //    console.log("퍼센트 : " +scrollPercentage);
    }

    console.log(data, scrollPercentage);

    // 로딩 중이면
    if(loading){
        // 컴포넌트도 함수이기 때문에 return을 만나면 그 즉시 종료 
        return(
            <div>데이터 로딩 중...</div>
        )
    }

    // 에러메세지에 무언가 있으면(빈 문자열 '' == false)
    if(errMsg){
        return(
            <div>{errMsg}</div>
        )
    }


    return(
        <>
            <div className='top-nav-container'>
                <h1>Scroll Indicator</h1>
                {/* 스크롤 진행도 전체 범위 */}
                <div className='scroll-progress-tracking'>
                    {/* 스크롤의 실제 위치를 퍼센트로 그려줄 박스 */}
                    <div className='current-progress-bar' style={{width:`${scrollPercentage}%`}}>
                    </div>
                </div>
            </div>

            {/* 스크롤용 데이터 */}
            <div className='data-list'>
                {   // data가 비어있지 않고 길이가 0보다 클 떄 p태그 생성
                    data && data.length > 0 ? 
                        data.map((e, idx)=>{
                            return(
                                <p key={idx}>{e.title}</p>
                            )
                        }) 
                        : null
                }
            </div>
        </>
    )
}