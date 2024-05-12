import logo from './logo.svg';
import './App.css';
import { Route, Routes } from 'react-router-dom';

function App() {
  return (
    <div>
      <Routes>
        <Route path='/' element={<div>홈페이지</div>}></Route>
      </Routes>

    </div>

    
  );
}

export default App;
