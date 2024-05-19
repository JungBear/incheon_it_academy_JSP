// .ts : 타입스크립트 파일
// .tsx : jsx용 타입스크립트 파일

// npm install -g typescript(nodejs가 먼저 설치되어 있어야함)
// 자바스크립트에 type검사를 강화한 버전
// tsconfig.json 파일을 생성하고 아래와 같이 입력
/*
    {
        "compilerOptions" : {
            "target" : "ES5",
            "module" : "CommonJS"
        }
    }

*/

// tsc -w로 실행(.js파일로 변환)

let myName = '홍길동';
myName = '김유신';
// 자료형 : string, number, boolean, null, undefined, [], {}, bigint
let 이름 : string = '사과';
let num : number = 2;
let numArr : number[] = [1,2,3];
let strArr : string[] = ['a', 'b', 'c'];
let obj1 : {name : string, age : number} = {name:'김유신', age :22};
let obj2 : {_name : string, _age : number, _adult : boolean} = {
    _name : '홍길동',
    _age : 33,
    _adult : true
};

// title, btn
let title = document.getElementById('title');
let btn = document.getElementById('btn');

// 버튼 누르면 title의 html내용을 '반갑습니다'로 바꾸기
if(btn != null) {
    btn.addEventListener('click',(e)=>{
        if(title != null) {
            title.innerHTML = '안녕하세요';
        }else{
            console.log("btn이없다")
        }
    })
}


