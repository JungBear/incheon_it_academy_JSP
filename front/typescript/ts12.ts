// 제네릭 타입
// - 사용하는 곳에서 타입을 결정
// - `<>`

// 배열이 들어오면 첫번째 요소만 리턴
function 제네릭함수<T>(arr : T[]) : T{
    return arr[0];
}

// 사용법
// 제네릭함수<type>();
let 결과12 = 제네릭함수<number>([1,2,3]);
let _결과12 = 제네릭함수<string>(['a', 'b', 'c']);
console.log(결과12);
console.log(_결과12);