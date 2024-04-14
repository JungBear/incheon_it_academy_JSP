import logo from './logo.svg';
import './App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Container, Nav, Navbar, Button} from 'react-bootstrap';

import data from './data';
import {num1, num2, num3} from './data';

function App() {
  return (
    <div className="App">
      <Navbar bg="dark" data-bs-theme="dark">
        <Container>
          <Navbar.Brand href="#home">{data}</Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="#home">{num1}</Nav.Link>
            <Nav.Link href="#features">{num2}</Nav.Link>
            <Nav.Link href="#pricing">{num3}</Nav.Link>
          </Nav>
        </Container>
      </Navbar>
      <br/>
      <Button variant="primary">primary</Button>{' '}
    </div>
  );
}

export default App;
