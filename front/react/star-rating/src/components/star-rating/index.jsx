// 컴포넌트를 만들어서 내보낸다

// 리액트 아이콘 설치 후 import
// npm install react-icons
import {FaStar} from 'react-icons/fa';
import './styles.css';
import { useState } from 'react';


// StarRation 컴포넌트
export default function StarRating({starCount = 5})
{
// starCount의 기본값은 5이고, 컴포넌트를 사용하는 곳에서 
// 값을 변경할 수 있다
// state 2개 만들기(별점, 마우스오버 위치를 기억)
  let [score, setScore] = useState(0);
  let [hover, setHover] = useState(0);

// 배열 : 총 별의 갯수(starCount) -> 반복문
  let stars = [];
  for(let i = 0; i < starCount; i++){
    stars.push(i+1);  // [1, 2, 3, 4, 5]
  }

  function handleMouseClick(ele){
    // 클릭한 별에다가 setScore()
    console.log(ele);
    setScore(ele);
    
  }

  function handleMouseMove(ele){
    // 마우스 들어간 별에다가 setHover(1)
    // 어느별에 마우스가 올라가 있는지
    console.log(ele);
    setHover(ele);
  }

  function handleMouseLeave(){
    // 마우스 나간 별에다가 setHover(rating)
    setHover(score);

  }



  return(
    <>
      <div>
        {
          // map : 배열의 갯수만큼 갯수, 첫반째는 각 내부요소의 값, 두번째는 인덱스(위치)
          // map안에 콜백함수를 넣어서 동작
          stars.map((e, idx)=>{
            // ele : 해당 idx의 요소

            // 반복적으로 생성할 애들은 return에 작성
            return(
              <FaStar size={40} key={e}
              // 마우스가 올라가 있거나, 선택된 상태면
              // 클래스명 변경
                className={e <= (hover || score) ? 'active' : 'inactive'}
              onClick={()=>{handleMouseClick(e)}}
              onMouseMove={()=>{handleMouseMove(e)}}
              onMouseLeave={()=>{handleMouseLeave()}}
              />
            )
          })
        }
      </div>
    </>
  )
}