import { useEffect, useState } from 'react';
import { Col, Container,Row } from 'react-bootstrap';
import { useParams } from 'react-router-dom';

    export default function DetailPage(props){

        let {id} = useParams();

        // 선택된 아이템인지 식별(items의 id와 URL파라미터의 id가 같은지 검사)
        let selectedItem = props.items.find((e)=>{
            return e.id == id
        })

        let[hideDom, setHideDom] = useState(false);


        // useEffect : 오래 걸리는 작업을 처리할때
        // 리액트의 컴포넌트 라이프사이클(생성, 갱신, 삭제) : 각 라이프사이클마다 코드를 실행
        // mount : 생성, update : 갱신, ummount : 삭제

        useEffect(()=>{

            // mount와 update시에 실행될 코드
            // html을 먼저 보여주고 오래 걸리는 작업을 처리( 서버요청 등...)
            console.log('mount')

            setTimeout(()=>{
                setHideDom(true)
            },2000)
            // unmount에 대해서는 return에 작성
            return(()=>{
                console.log("unmount")
            })
        })

        // URL파라미터를 useParams()로 받는다 (상세페이지의 id번호)
        return(
        <>
            <Container>
                {
                    hideDom === false ? (
                    <> 

                    </>) : null
                }
            <Row>
                <Col>
                  <img src={props.img[selectedItem.id]} width={'400px'} height={'300px'}/>
                </Col>    
                <Col>
                    <h4>{selectedItem.title}</h4>
                    <p>{selectedItem.content}</p>
                    <p>{selectedItem.price} 원</p>
                </Col>
            </Row>
            </Container>
        </>
        )
    }