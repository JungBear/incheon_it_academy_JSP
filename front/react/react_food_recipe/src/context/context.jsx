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
    return(
        <GlobalContext.Provider value={{searchParam, setSearchParam, hSubmit, foodList, setFoodList, foodDetailData, setFoodDetailData, favoritesList}}>
            {children}
        </GlobalContext.Provider>
    )
}