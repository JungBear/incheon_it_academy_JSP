import { createContext, useState } from "react";


export const GlobalContext = createContext(null);

// 리덕스 대신 전역적으로 사용할 state(index.js에서 App컴포넌트를 감싸줘야함)
export default function GlobalState({children}){

    // 검색값 state
    let [searchParam, setSearchParam] = useState("");
    // 음식 리스트 state
    let [foodList, setFoodList] = useState([]);
    // 음식 상세 데이터 state
    let [foodDetailData, setFoodDetailData] = useState(null);
    // 즐겨찾기 등록 리스트
    let [favoritesList, setFavoritesList] = useState([]);

    // 제공할 함수
    // 검색을 하면 검색명으로 get요청
    async function hSubmit(event){
        // 부모까지 이벤트가 버블링 되는 것을 막는다(전달되는 것 막음)
        event.preventDefault();
        // https://forkify-api.herokuapp.com/api/v2/recipes?search=${재료명}
        // get요청
        try {
            const res = await fetch(`https://forkify-api.herokuapp.com/api/v2/recipes?search=${searchParam}`);    
            // JSON문자열로 데이터를 주고받아서 사용할 수 있는 쟈료형으로 변경
            const infomation = await res.json();

            console.log(infomation)

            if(infomation?.data.recipes){
                setFoodList(infomation?.data.recipes);
                setSearchParam("");
            }
        } catch (e) {
            console.log(e)
        }
    }

    // 즐겨찾기 등록 리스트 state의 배열을 수정하는 함수(추가, 삭제)
    // state의 배열은 직접 수정x => ...으로 분리하고 []로 감싸서 카피본으로 수정
    // 변수를 안쓰고 useState를 사용하는 이유는 화면을 갱신해 주기위해
    function hAddToFavorite(getCurItem){
        let copyFavoritesList = [...favoritesList]; // 배열 통째로 분해했다가 다시 배열로 만들어서 대입
        
        // 동일한 ID가 있는지 검사(getCurItem의 ID와 favoritesList의 ID들을 비교)
        const idx = copyFavoritesList.findIndex(e => e.id === getCurItem.id); // 못찾으면 -1, 찾으면 해당 위치 return
        if(idx === -1){
            // 없으면 즐겨찾기 리스트에 추가
            copyFavoritesList.push(getCurItem); 
        }else{
            // 즐겨찾기 리스트에 있었으면 제거
            copyFavoritesList.splice(idx);
        }

        // 새로만든 배열을 state에 바꿔준다.
        setFavoritesList(copyFavoritesList);
    }

    return(
        <GlobalContext.Provider value={{searchParam, setSearchParam, hSubmit, foodList, setFoodList, foodDetailData, setFoodDetailData, favoritesList, hAddToFavorite}}>
            {children}
        </GlobalContext.Provider>
    )
}