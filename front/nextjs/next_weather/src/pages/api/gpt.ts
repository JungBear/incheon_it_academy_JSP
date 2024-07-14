// nodejs전용 코드를 넣을 때 사용
'use server';

import { NextApiRequest, NextApiResponse } from "next";
import OpenAI from "openai";

const openai = new OpenAI({
    apiKey: process.env.OPENAI_API_KEY
})

export default async function handler(req : NextApiRequest, res : NextApiResponse){
    if(req.method === 'POST'){
        const {prompt} = req.body;

        try{
            const response = await openai.chat.completions.create({
                model : 'gpt-3.5-turbo',
                messages : [
                    {role:'system', content:'HTML 태그를 제외한 내용을 한글로 적어주세요'},
                    {role:'user', content:prompt}
                ],
                max_tokens:500,
                
            })

            const answer = response.choices[0].message.content;
            res.status(200).json({answer});
        }catch(e){
            console.error("gpt 오류 : " + e);
            return res.status(500).json({error:'Failed'})
        }
    }
}