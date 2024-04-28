/*
// 리덕스로 state값을 보관할 파일
// props없이 state를 공유
// npm install @reduxjs/toolkit react-redux
// 1. 리덕스 설치
// 2. state값을 저장할 store.js 생성
// 3. index.js에서 <App/>을 <Provider>로 감싸줌
*/

import { configureStore, createSlice } from "@reduxjs/toolkit";
import data from "./data";

// useState => createSlice(리덕스)
let slice1 = createSlice({
    name:'이름',
    // initialState : 사용하고자 하는 값
    initialState:'초기값',
    reducers:{
        // 리덕스에 등록된 슬라이스 값을 변경하고자 하면 store에서 변경하는 함수로 등록
        // 사용한는 곳에서 그 함수를 사용하는 식으로 변경(간단히 대입X)
        changeData(state, actions){
            // state : 기존의 initialState값
            // actions : 사용하는 곳에서 매개변수로 넘긴 값, .payload를 사용해줘야 한다
            // return에 변경하고자 하는 값을 적어줌
            return '슬라이스 변경' + state + actions.payload;
        }
    }
})

// slice1을 변경하는 함수를 내보낸다(useDispatch로 사용한다)
export let {changeData} = slice1.actions;

let slice2 = createSlice({
    name:'slice2',
    initialState:data,
    reducers : {
        // 기존의 data를 수정할 함수
    }
})


// configureStore에서 내보내줘야 다른곳에서 사용 가능
export default configureStore({
    reducer:{
        // state(slice)를 다른곳에서 사용할 수 있게 등록하는 곳
        // .reducer : initialState에 등록된 데이터를 선택
        slice1 : slice1.reducer,
        slice2 : slice2.reducer
    }
})
