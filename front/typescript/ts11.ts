let var11 : number = 11;
let number11 : (number | string) = '11';

function fun11(num1 : (number | undefined | string), num2 : number) : number{
    return 11;
}

type objType11 = {
    [key : string] : number
}

// 인터페이스(객체 전용)
// name : string, age : number

type objName = {name : string}; // 반드시 name을 갖고 있어야함
type objAge = {age : number}; // 반드시 age를 갖고 있어야함

let 이름11 : objName = {name : '이순신'};
// 이름과 나이를 전부 가지게 하고 싶다
type newType = objName & objAge;
let _이름11 : newType = { name : '이순신', age : 33};

// 객체의 속성을 상속 : interface = 다른 객체의 속성을 물려 받음
interface IPerson {name : string};
interface IPerson {age : number};

// 인터페이스는 이름이 겹치면 합침
let 아빠 : IPerson = {name : '신영만', age : 33};

interface ISon extends IPerson{} // 상속
let 아들 : ISon = {name : '짱구', age : 5};