import './product-tile.css';

// home 컴포넌트에서 props로 상품정보를 받는다
export default function ProductTile({product}){
    return(
        <>
            <div className='flex-col-container'>
                <div style={{'height' : '180px'}}>
                    {/* product가 있으면 */}
                    <img className='full-cover-img' src={product?.image} alt={product?.title}/>
                </div>
                
            </div>
        </>
    )
};