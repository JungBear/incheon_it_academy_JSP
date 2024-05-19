let 문자열_js : string = 'str';

let 문자열과숫자 : (string | number) = 'str';
문자열과숫자 = 123;

let 배열 = [1,2,3];
let fetch배열 : (undefined | number | string)[] = [1,'2','3'];

function 데이터사용(x : (undefined | number | string)[]) : number{
    if(typeof x[0] === 'string'){
        return Number(x[0]) + 1;
    }else if(typeof x[0] === 'number'){
        return x[0] + 1;
    }else {
        return 1;
    }

}

데이터사용(fetch배열);

// 함수의 return이 없으면 void
// 숫자를 매개변수로 받아서, 리턴값은 없는 함수
function 리턴없음(num? : number) : void{
    if(num){

        console.log(num);
    }else{
        console.log("없음");
    }
}

// 타입스크립트는 자바스크립트와는 다르게 매개변수로 만든 만큼 채워줘야 사용 가능
리턴없음(3);
리턴없음(); 

