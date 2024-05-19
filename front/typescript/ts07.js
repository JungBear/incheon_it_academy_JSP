// 변수에 대입될 수 있는 값을 미리 정해놓는다
// Literal Types
var TS07;
(function (TS07) {
    var 변수;
    변수 = '홍길동';
    // 함수의 매개변수나 리턴값에 내가 지정한 값만 오게 할 수 있다 
    function 가위바위보(str) {
        return '가위';
    }
    가위바위보('가위');
})(TS07 || (TS07 = {}));
