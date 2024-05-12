import { useEffect, useState } from "react";
import "./home.css";
import {} from 'react-icons';
import {Circles} from 'react-loader-spinner'
import ProductTile from "../components/product-tile/product-tile";

export default function Home(){

    // 받아온 데이터 state에 저장
    const [products, setProducts] = useState([]);
    const [loading, setLoading] = useState(false);

    //http://fakestoreapi.com/products
    //
    // 서버에서 데이터 받아오기
    async function fetchListProducts(){
        setLoading(true);
        const res = await fetch('http://fakestoreapi.com/products');
        const data = await res.json();

        console.log(data);
        if(data){
            setLoading(false);
            setProducts(data);
        }

    }
    
    useEffect(()=>{
        fetchListProducts();
    },[])

    return(
        <div>
            {loading ? (<div className="my-loading">
                <Circles height={'120'} width={'120'} color="rgb(127, 29, 29)" visible={true}/>
                </div>) 
                : (
                <div className="my-product-grid">
                    {
                    products.map((product, idx)=>{
                        return(
                            <ProductTile product={product} key={idx}/>
                        )
                    })
                    }
                </div>)}
        </div>
    )
}