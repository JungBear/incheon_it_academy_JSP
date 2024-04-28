import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Container, Col, Row, Nav, Navbar, Button} from 'react-bootstrap';


import data from './data';
import {num1, num2, num3} from './data';

// 이미지를 사용하려면 import
import banner from './banner.jpg';
import { useState } from 'react';
import { BrowserRouter, Link, Outlet, Route, Routes, useNavigate } from 'react-router-dom';
import DetailPage from './pages/Detail';
import Cart from './pages/Cart';


function App() {

  let [items, setItems] = useState(data);
  let [img, setImg] = useState(['/bread.jpg', '/cake.jpg','/makarong.jpg','/logo192.png']);
  let navigate = useNavigate();

  return (
    <div className="App">
      
        <Navbar bg="dark" data-bs-theme="dark">
          <Container>
            <Navbar.Brand href="/">
              <img src='/logo192.png' width={'50px'}/>
            </Navbar.Brand>
            <Nav className="me-auto">
              <Nav.Link href="/">홈</Nav.Link>
              <Nav.Link href="/detail/0">상세페이지</Nav.Link>
              <Nav.Link href="/about">About</Nav.Link>
              <Nav.Link onClick={()=>{navigate('/cart')}}>Cart</Nav.Link>
              <Nav.Link onClick={()=>{navigate(-1)}}>뒤로가기</Nav.Link>
              <Nav.Link onClick={()=>{navigate(1)}}>앞으로가기</Nav.Link>
              
            </Nav>
          </Container>
        </Navbar>
        <div className='main-bg'>

        </div>
        <Routes>
          <Route path='/' element={
            <>
              <Container>
                <Row>
                  {/* <ItemCol data={data[0]} img={'/bread.jpg'} />
                  <ItemCol data={data[1]} img={'/cake.jpg'} />
                  <ItemCol data={data[2]} img={'/makarong.jpg'} /> */}
                  {/* data 갯수와 img가 바뀔 수 있으니 useState처리 */}
                  {items.map(function(ele, idx){
                    return(
                        <ItemCol key={idx} data={items[idx]} img={img[idx]} />
                    )
                    })}
                </Row>
              </Container>
            </>
          }></Route>

          {/* :id => useParams()를 통해 상세 아이템을 변경 */}
          <Route path='/detail/:id' element={<DetailPage items={items} img={img}/>}></Route>
          <Route path='/about' element={<AboutPage/>}>
            <Route path='address' element={<div>주소</div>}></Route>
            <Route path='location' element={<div>위치</div>}></Route>
          </Route>
          <Route path='/cart' element={<Cart/>}></Route>
          <Route path='*' element={<div>그 외의 페이지(404)</div>}></Route>
        </Routes>

        <br/>
        {/* 리액트는 하나의 html을 다시 그리는 방식이기 때문에
        html을 이동하는 a태그보다는 <Link>를 사용 
        <Link to={"/"}><Button variant='warning'>리액트 부트스트랩 버튼</Button></Link>*/}
    </div>
  );
}

export default App;

function ItemCol(props){
  return(
    <>
      <Col>
        <img src={props.img} width={'300px'} height={'300px'}/>
        <h4>{props.data.title}</h4>
        <p>{props.data.price} 원</p>
      </Col>
    </>
  )
}

function AboutPage(){
  return(
    <>
      <div>
        <h4>어바웃페이지</h4>
      {/* 중첩Route의 위치를 결정 */}
        <Outlet/>
      </div>
    </>
  )
}