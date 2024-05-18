// 변수에 문자열 또는 숫자가 올 수 있다 =? 유니온 타입
let var1 : (string | number) = 'kim';
var1 = 33;

// 타입스크립트에서는 자료형도 변수로 저장할 수 있다(type자료형)
type TypeVar = string | number | undefined;
let var2 : TypeVar = 'str';
var2 = 33;

// 배열에서 특정 위치에 오는 값의 데이터를 직접 정해주고 싶다
let numArr2 : number[] = [1,2,3,4];
// [숫자, 문자열, 불린, 숫자]
let toupleArr : [number, string, boolean, number] = [3, 'str', true, 2];

// 함수의 매개변수와 리턴값의 자료형을 검사
// 매개변수로는 숫자, 리턴으로도 숫자
function fun1(num : number) : number
{
    return num * 2;
}

fun1(31);