import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import { Provider } from 'react-redux';
import { createStore } from 'redux';
import { PayloadAction, configureStore, createSlice } from '@reduxjs/toolkit';

const 초기값 : {count : number, user : string} = {count : 0, user : '신순'};

// createSlice
// createSlice에는 name, initialState, reducers 만들어 주기
const countSlice = createSlice({
  name : 'counter',
  initialState : 초기값,
  reducers:{
    증가(state){
      state.count += 1;
    },
    감소(state){
      state.count -= 1;
    },
    더하기(state, action : PayloadAction<number>){
      state.count += action.payload;
    },
    초기화(state){
      state.count = 0;
    }
  }
})

// Provider에 제공할 스토어
let store = configureStore({
  reducer : {
    리듀서1 : countSlice.reducer
  }
})

// 제공할 리듀서 변수, 함수, State를 import할 수 있게 export
export let {증가, 감소, 더하기, 초기화} = countSlice.actions;
// 타입스크립트에서 리덕스를 사용할 때, 내보낼 상태의 타입을 만들기
export type RootState = ReturnType<typeof store.getState>;

const root = ReactDOM.createRoot(
  document.getElementById('root') as HTMLElement
);
root.render(
  <React.StrictMode>
    <Provider store={store}>
      <App />
    </Provider>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
/*
const 초기값 : {count : number} = {count : 0}; // 초기값 0
// 옛날 방법(@reduxjs/toolkit을 안쓰고)
// 리듀서 만들기 ( 전역상태/변수를 수정살 수 있게 제공하는 함수 생성)
function reducer(state = 초기값, action : {type: string}){
  if(action.type === '증가'){
    return {...state, count : state.count + 1};
  } else if(action.type === '감소'){
    return {...state, count : state.count - 1};
  }else {
    return 초기값
  }
}

const store = createStore(reducer);
*/