import React from 'react';
import logo from './logo.svg';
import './App.css';
import Profile from './components/profile/Profile';
import { useSelector, useDispatch } from 'react-redux';
import { Dispatch } from 'redux';
import { RootState, 증가, 감소, 더하기, 초기화 } from '.';

type Person ={
  name : string,
  age? : number
}

let person : Person = {
  name : "peter",
  age : 22
}

function App() : JSX.Element {

  let box : JSX.Element = <div>박스</div>
  const 리덕스에서꺼내옴 = useSelector((state:RootState) => state)
  // dispatch라는 키워드를 통해 리듀서의 함수를 사용 가능
  // 리듀서의 함수는 리덕스에 보관된 상태/변수를 수정하기 위해 제공
  const dispatch : Dispatch = useDispatch();
  

  return (
    <div className="App">
      <Profile name='lee' age='20' />
      <p>{리덕스에서꺼내옴.리듀서1.user}입니다.</p>
      <p>{리덕스에서꺼내옴.리듀서1.count}</p>
      <button onClick={()=>{dispatch(증가())}}>+</button>
      <button onClick={()=>{dispatch(감소())}}>-</button>
      <button onClick={()=>{dispatch(더하기(4))}}>+4</button>
      <button onClick={()=>{dispatch(초기화())}}>reset</button>
    </div>
  );
}

export default App;
