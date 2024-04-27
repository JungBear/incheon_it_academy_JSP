import { useEffect, useState } from 'react';
import './slider.css';
import {  BsArrowLeftCircleFill, BsArrowRightCircleFill } from 'react-icons/bs';
// 리액트 아이콘
// npm install react-icons


export default function ImageSlider(props){

    let [images, setImages] = useState([]);
    let [curSlide, setCurSlide] = useState(0);
    let [loading, setLoading] = useState(false);
    let [errMsg, setErrMsg] = useState(null);

    useEffect(()=>{
            // mount 생성시, update 갱신시, unmount 제거시

        // 평소에는 mount, update는 같이 동작
        // unmount 는 return()에서 동작
        // update의 동작을 특정 대상에 대해서만 실행하려면 두번째 인자에 []로 넣어줌
        if(props.url !== ''){
            fetchImage(props.url);
        }
    }, [props.url]);

    async function fetchImage(getUrl){
        setLoading(true);
        try {
            //https://picsum.photos/v2/list?page=1&limit=10
            let response = await fetch(`${getUrl}?page=${props.page}&limit=${props.limit}`);
            const data = await response.json();

            if(data){
                setImages(data);
            }
        } catch (error) {
            setErrMsg(error.message);
        } finally {
            setLoading(false);
        }
    }

    function goPrev(){
        // 처음 위치면 마지막 슬라이드로 이동
        if(curSlide == 0){
            setCurSlide(images.length - 1);
        }else{
            setCurSlide(curSlide - 1);
        }
    }

    function goNext(){
        // 마지막 위치면 처음 슬라이드로 이동
        if(curSlide == (images.length - 1)){
            setCurSlide(0);
        }else{
            setCurSlide(curSlide + 1);
        }
    }

    return(
        <>
            <div className="slider-container">
                <BsArrowLeftCircleFill className='arrow arrow-left' onClick={goPrev}/>
                {
                    images && images.length ? (
                        images.map((image, idx)=>{
                            return(
                                <img key={idx} src={image.download_url} className={curSlide === idx ? "current-img" : "current-img hide-current-img"} />
                            ) 
                        })
                    ) : <div>이미지 로딩 중...</div>
                }
                <BsArrowRightCircleFill className='arrow arrow-right' onClick={goNext}/>
            </div>
        </>
    )
}
