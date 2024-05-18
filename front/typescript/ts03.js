var objVal = { age: 33, height: 172.3 }; // 객체의 각 요소애 숫자만 넣을 때
// 클래스
var MyClass = /** @class */ (function () {
    function MyClass(매개변수) {
        this.멤버변수 = 매개변수;
    }
    return MyClass;
}());
var 객체1 = new MyClass("감나빗");
var 객체2 = new MyClass("str2");
