var array = [6, 3, 40, 7,2];

array.sort();
console.log(array);

array.sort((a,b) => a-b);
console.log(array);

array = ['qwe34', 'qwe12', 'zsd', 'rrr'];
array.sort();
console.log(array);

array = ['한글34', '한글12', '가나다', '안녕하세여'];
array.sort();
console.log(array);

var objectArray = [
    {'id' : 0, 'name' : '홍길동'},
    {'id' : 2, 'name' : '김유신'},
    {'id' : 1, 'name' : '강감찬'}
]

objectArray.sort((a,b)=>{return a['name'].localeCompare(b['name'])})
console.log(objectArray);

var filterObject = objectArray.filter((e)=>{
    return e['id'] >= 2
});
console.log(filterObject);

var dollar = [1, 2, 3, 4, 5, 6, 7];
var won = dollar.map(e=>{
    return e * 1300
})

dollar.forEach((e)=>{
    console.log(e)
})