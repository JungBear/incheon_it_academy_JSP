import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Container, Col, Row, Nav, Navbar, Button} from 'react-bootstrap';

import data from './data';
import {num1, num2, num3} from './data';

// 이미지를 사용하려면 import
import banner from './banner.jpg';
import { useState } from 'react';

function App() {

  let [items, setItems] = useState(data);
  let [img, setImg] = useState(['/bread.jpg', '/cake.jpg','/makarong.jpg']);

  return (
    <div className="App">
      <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home">
            <img src='/logo192.png' width={'50px'}/>
          </Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="#home">홈</Nav.Link>
            <Nav.Link href="#features">상세페이지</Nav.Link>
            <Nav.Link href="#pricing">About</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
      <div className='main-bg'>

      </div>

      <Container>
        <Row>
          {/* <ItemCol data={data[0]} img={'/bread.jpg'} />
          <ItemCol data={data[1]} img={'/cake.jpg'} />
          <ItemCol data={data[2]} img={'/makarong.jpg'} /> */}
          {/* data 갯수와 img가 바뀔 수 있으니 useState처리 */}
          {items.map(function(ele, idx){
            return(
              <>
                <ItemCol data={data[idx]} img={img[idx]} />
              </>
            )
            })}
        </Row>
      </Container>

      {/* public에 있는 애들은 /bread.jpg처럼 사용할 수 있다 */}
      {/* <div style={{backgroundImage:`url(/bread.jpg)`, height: '14vw', width:'100%',backgroundSize:'cover',}}>

      </div> */}


      <br/>
      <Button variant="primary">primary</Button>{' '}
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