// 변수에 문자열 또는 숫자가 올 수 있다 =? 유니온 타입
var var1 = 'kim';
var1 = 33;
var var2 = 'str';
var2 = 33;
// 배열에서 특정 위치에 오는 값의 데이터를 직접 정해주고 싶다
var numArr2 = [1, 2, 3, 4];
// [숫자, 문자열, 불린, 숫자]
var toupleArr = [3, 'str', true, 2];
// 함수의 매개변수와 리턴값의 자료형을 검사
// 매개변수로는 숫자, 리턴으로도 숫자
function fun1(num) {
    return num * 2;
}
fun1(31);
