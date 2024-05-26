import { useState } from "react"

export default function Profile(props : {name:string, age:string}) : JSX.Element {
    
    // state는 일반적으로 타입을 명시x(자동 적용)
    let [myState, setMyState] = useState([]);
    
    return(
        <>
            <p>{props.name} 입니다.</p>
            <p>{props.age}살</p>
        </>
    )
}