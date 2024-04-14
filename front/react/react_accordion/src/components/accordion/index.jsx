import './styles.css';
import data from './data';
import { useState } from 'react';

export default function Accordion(){
    let [selected, setSelected] = useState(null);
    let [enableMultiSelection, setEnableMultiSelection] = useState(null);
    let [selectedList, setSelectedList] = useState([])

    function clickTitle(id){
        //console.log(id);
        selected === id ? setSelected(null) : setSelected(id);
    }

    function multiselectTitle(id){
        let copyList = [...selectedList];
        let findIdxOfId = selectedList.indexOf(id);
        if(findIdxOfId === -1){
            copyList.push(id);
        }else{
            copyList.splice(findIdxOfId, 1);
        }
        setSelectedList(copyList);
        
    }


    //console.log(enableMultiSelection);
    //console.log(selectedList);

    return(
        <>
            <div className="wrapper">
                <button onClick={()=>{
                    setEnableMultiSelection(!enableMultiSelection);
                    setSelectedList([]);
                    setSelected(null);
                }}>다중 선택 {enableMultiSelection ? 'OFF' : 'ON'}</button>
                <div className="accordion">
                    {data.map((ele, idx)=>{
                        return(
                            <div className="item" key={idx}>
                                <div className="title" onClick={()=>{
                                    enableMultiSelection ? multiselectTitle(ele.id) : clickTitle(ele.id)
                                    }}>
                                    <h3>{ele.title}</h3>
                                    <span>+</span>
                                </div>
                                {enableMultiSelection ? 
                                    selectedList.indexOf(ele.id) !== -1 && <div className="content">{ele.content}</div>
                                    :selected === ele.id && <div className="content">{ele.content}</div>
                                }
                            </div> 
                        )
                       
                    })}

                </div>
            </div>
        </>
    )
}