import { Dispatch, SetStateAction, useState } from 'react';
import './gpt.css';

type Props ={
    answer : string;
    setAnswer : Dispatch<SetStateAction<string>>;
}

export default function Gpt({answer, setAnswer} : Props){

    const [inputValue, setInputValue] = useState('');

    const handleSubmit = async (event : React.FormEvent) =>{
        event.preventDefault();

        if(!inputValue) return;
        try{
            const res = await fetch('/api/gpt',{
                method:'post',
                headers : {'Content-Type' : 'application/json'},
                body : JSON.stringify({prompt : inputValue})
            })

            if(!res.ok){
                throw new Error('Network response was not ok');
            }

            const data = await res.json();
            setAnswer(data.answer);

        }catch(e){
            console.error('gpt error : ', e);
        }

        

    }

    return(
        <div className='gpt-container'>
            <h2>chatGPT</h2>
            <form onSubmit={handleSubmit}>
                <input type='text'
                    onChange={(e)=>setInputValue(e.target.value)}
                    value={inputValue}
                />
            <button type='submit' className='gpt-button'>입력</button>
            </form>

            <p style={{whiteSpace:'pre-line'}}>
                {answer}
            </p>
        </div>
    )
}