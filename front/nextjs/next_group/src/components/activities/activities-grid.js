import style from './activities-grid.module.css';
import ActiveitesItem from './activities-item';

export default function ActiveitesGrid({activeites}){
    return(
        <div>
            <ul className={style.activities}>
                {activeites.map((item, idx)=>{
                    return(
                        <li key={item._id}>
                            <ActiveitesItem {...item}/>
                        </li>
                    )
                })}
            </ul>
        </div>
    )

}