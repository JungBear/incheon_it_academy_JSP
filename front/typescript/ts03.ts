// object 속성
type objType = {
    [key:string]:number
}

let objVal : objType = {age:33, height : 172.3};  // 객체의 각 요소애 숫자만 넣을 때

// 클래스
class MyClass{
    멤버변수 : string;

    constructor(매개변수 : string){
        this.멤버변수 = 매개변수;
    }
}

let 객체1 = new MyClass("감나빗");
let 객체2 = new MyClass("str2");