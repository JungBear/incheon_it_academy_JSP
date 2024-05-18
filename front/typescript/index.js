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
var myName = '홍길동';
myName = '김유신';
// 자료형 : string, number, boolean, null, undefined, [], {}, bigint
var 이름 = '사과';
var num = 2;
var numArr = [1, 2, 3];
var strArr = ['a', 'b', 'c'];
var obj1 = { name: '김유신', age: 22 };
var obj2 = {
    _name: '홍길동',
    _age: 33,
    _adult: true
};
