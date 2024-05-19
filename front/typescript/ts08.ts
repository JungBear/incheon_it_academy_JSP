// ...파라미터 (무한히 들어올 수 있는 매개변수)
// rest parameter
function 함수8(...v : (number | string)[]){
    console.log(v);
}

함수8(1);
함수8(1,2,3,4,'a','b');
// 
let arr1 = [1,2,3];
let arr2 = ['a', 'b', 'c'];

let arr3 : unknown = [...arr1, ...arr2];
console.log(arr3)

let [변수1, 변수2] : [string, number] = ['hello', 300];
let {key1, key2} : {key1 : boolean, key2 : number} = {key1:true, key2:30}
let obj08 : {key1 : boolean, key2 : number} = {key1:true, key2:30}