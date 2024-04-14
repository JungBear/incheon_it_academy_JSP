import logo from './logo.svg';
import './App.css';
import React, {useState} from 'react'

function App() {
  let value = "목차";
  let [value2, setValue2] = useState('서버에서 실시간으로 받는 값');
  let [title, setTitle] = useState(['제목1','제목2','제목3','제목4']);
  let [dateTime, setDateTime] = useState(['2024-04-13','2024-04-12','2024-03-29','2024-03-12']);
  let [score, setScore] = useState([0, 0, 0, 0]);
  let [modal, setModal] = useState(false);
  let [curIdx, setCurIdx] = useState(0);

  function upScore(i){
    setScore(()=>{
      let src = [...score];
      src[i]++;
      return src;
    })
  }

  function showDetail(){
    if(modal){
      setModal(false);
    }else{
      setModal(true);
    }
  }

  return (
    <div className="App">
      <div className='black-nav'>
        <img src={logo} width={"100px"} height={"100px"} alt=""></img>
        <h4 style={{color:'#cfd', fontSize:"20px"}}>{value2}</h4>
      </div>

      {
        /*
        for는 map
        배열.map()
        */
       
        title.map(function(ele, idx){
          return(
          <>
            <div className='list' key={idx}>
              <h4 onClick={()=>{
                setCurIdx(idx);
                showDetail();
              }}>{ele} <span onClick={(e)=>{
                e.stopPropagation();
                upScore(idx);
              }}>👍</span> {score[idx]}</h4>
              <p>{dateTime[idx]} 작성</p>
            </div>
            
          </>
          )
        })
      }

     

        {/** 부분만 나누고 싶으면 컴포넌트로 만든다 
         * modal값이 false면 안보이게, true면 보이게
         */}  
        { modal === true ? <Modal curIdx={curIdx} title={title} date={dateTime}/> : null} 
    </div>
  );
}

export default App;

// Modal 컴포넌트
function Modal(props){
  return(
    <>
      <div className='modal'>
        <h4>{props.title[props.curIdx]}</h4>
        <p>{props.date[props.curIdx]}</p>
        <p>상세 내용</p>
      </div>
    </>
  )
}