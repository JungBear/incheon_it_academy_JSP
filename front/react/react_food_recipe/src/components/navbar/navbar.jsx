import { Link, NavLink } from 'react-router-dom'
import './navbar.css'
import { useContext } from 'react'
import { GlobalContext } from '../../context/context';

export default function NavBar(){

    const {searchParam, setSearchParam, hSubmit} = useContext(GlobalContext);

    console.log(searchParam);
    return(
        <nav className='nav-flex-container'>
            <h2 className='nav-logo'>
                <Link to={'/'}>음식 레시피 앱</Link>
            </h2>

            <form onSubmit={hSubmit}>
                <input className='nav-search-input' type="text" name='search' placeholder='재료명을 입력하세요' value={searchParam} onChange={(e)=>{setSearchParam(e.target.value)}}/>
            </form>

            <ul className='nav-link-ul'>
                <li>
                    <NavLink to={'/'} className='nav-link-li'>홈</NavLink>
                </li>
                <li>
                    <NavLink to={'/favorites'} className='nav-link-li'>즐겨찾기 </NavLink>
                </li>
            </ul>
        </nav>
    )
}