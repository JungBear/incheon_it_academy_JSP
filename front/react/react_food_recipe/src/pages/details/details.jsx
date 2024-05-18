import { useParams } from 'react-router-dom'
import './details.css'
import { useContext, useEffect } from 'react';
import { GlobalContext } from '../../context/context';

export default function Details(){
    // id를 통해 들어왔으니 해당 아이디에 대한 데이터 가져오기
    const {id} = useParams();

    // context에서 사용할 state들을 받아온다
    // 상세보기에서 foodDetailDate에 데이터를 받아오고
    // 상세보기에서 즐겨찾기에 추가하게 한다
    const {foodDetailData, setFoodDetailData, favoritesList, hAddToFavorite} = useContext(GlobalContext);

    useEffect(()=>{
        async function getFoodDetail(){
            // 음식 레시피 상세정보 받아오기
            // get요청으로 데이터를 서버에서 받아오기
            const res = await fetch(`https://forkify-api.herokuapp.com/api/v2/recipes/${id}`);

            const data = await res.json();
            console.log(data);
            if(data?.data){
                setFoodDetailData(data?.data);
            }
        }

        getFoodDetail();
    },[])

    return(
        <div className='details-container'>
            {/* 이미지 */}
            <div className='img-container'>
                <div className='img-wrapper'>

                    <img src={foodDetailData?.recipe?.image_url} className='img-style' alt='사진'/> 
                </div>

            </div>
            {/* 글 */}
            <div className='content-container'>
                <span className='text-publisher'>{foodDetailData?.recipe?.publisher}</span>
                <h3 className='text-title'>{foodDetailData?.recipe?.title}</h3>
                {/* 즐겨찾기 추가 버튼 */}
                <div>
                    <button className='favorites-btn' onClick={()=>{hAddToFavorite(foodDetailData?.recipe)}}>
                        {/* 해당 아이디가 facoritesList에 없으면 '추가' 있으면 '제거' */}
                        {
                            favoritesList && favoritesList.length > 0 && favoritesList.findIndex(item => item.id === foodDetailData.recipe?.id) !== -1 ? '즐겨찾기 제거' : '즐겨찾기 추가'
                        }
                    </button>
                </div>
                {/* 레시피내용 */}
                <div>
                    <span className='recipe-title'>레시피 : </span>
                    <ul className='recipe-content'>
                        {
                            // map을 통해서 들어있는 만큼만 반복하며 li태그 생성
                            foodDetailData?.recipe?.ingredients.map((ingredient, idx)=>{
                                return(
                                    <li key={idx}>
                                        <span>{ingredient.quantity} {ingredient.unit} {ingredient.description}</span>
                                    </li>
                                )
                            })
                        }
                    </ul>
                </div>
            </div>
        </div>
    )
}