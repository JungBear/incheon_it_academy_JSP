// 데이터 출력방법
// console.log("foo");

const { stringify } = require("querystring");
const { json } = require("stream/consumers");

// 변수 사용 방법
// var foo = "bar";

// console.log(foo);

// var foo = "bar";
// foo = "baz";

// console.log(foo);
//baz

// 문자열
// ""안에 값으 작성

// var foo = "bar";

// console.log(foo);
// bar

// 정수
// var year = 2024;

// console.log(year);
// 2024

// nan

// var nan = 2 - "foo";

// console.log(nan);
// NaN

// 양의 무한대
// Number 타입이 저장할 수 있는 가장 큰수
// console.log(Number.MAX_VALUE);
// 1.7e + 308

// console.log(Number.MAX_VALUE * 1.1)
//Infinity

// 음의 무한대
// console.log(-Number.MAX_VALUE)
//-1.7e+308

// console.log(-Number.MAX_VALUE*1.1);
// -Infinity

// Boolean

// console.log(1==3);
// false
// console.log(1==1);
// true

// undefined

// var foo;
// console.log(foo);
// undefined

// null
// var foo = null;
// console.log(foo);
// null

// Q.데이터 타입
// 아래 고양이에 대한 정보를 변수로 바꾸어 보세요
// (괄호 안은 데이터 타입)
// 1. 이름: 치즈(문자열)
// 2. 나이: 2살 (Number)
// 3. 귀여움 여부 : 귀여움 (Boolean)
// 4. 집 : 길고양이라서 집이없음 (Null)

// var cat = {
//     name:"치즈",
//     age:2, 
//     cute:true, 
//     home:null
// }


// 각 문자에 접근하는 방법
// var foo = "bar";


// console.log(foo[0]);
// b
// console.log(foo[1]);
// a
// console.log(foo[2]);
// c

// 문자 갯수구하기
// var foo = "bar"
// console.log(foo.length);
// 3

// var s = "hello " + 2024;
// console.log(typeof s);
// String

// 문자열과 백틱

// 여러줄의 텍스트입력
// 문자열 안에서 변ㅅ 사용

// var s = `i'm not a gay
// you are gay`

// console.log(s)
// i'm not a gay
// you are gay

// var name = '치즈';
// console.log(`고양이의 이름은 ${name}입니다.`);
// 고양이의 이름은 치즈입니다.

// 문자열 메서드
// 문자열에 특정한 작업을 수행

// 1 toUpperCase
// 2 indexOf
// 3 subString
// 4 trim

// toUpperCase

// var foo  = "bar";
// console.log(foo.toUpperCase())
// BAR

// var s="hello world";
// console.log(s.indexOf("l"))
// 2

// var s = "hello world"
// console.log(s.substring(2));
// llo world

// var s = "hello world"
// console.log(s.substring(2, 8));
// llo wo

// var foo = "  bar  "
// console.log(foo);
//   bar  
// console.log(foo.trim());
// bar

// Q. 문자열 메서드 
// 변수에 Q부터 끝까지 추출해보세요

// var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
// var startIndex = alphabet.indexOf("Q");
// console.log(alphabet.substring(startIndex));
// QRSTUVWXYZ


// Q. 연산자
// 아래의 문장을 코드로 작성해보고 결과를 출력해보세요
// 1. 빈 문자열과 false는 동등하다
// 2. null과 false는 비동등하다
// 3. 1은 true와 동등하고, 0은 false와 동등하다

// 1. 
// console.log("" == false); 
// true

// 2.
// console.log(null != false);
// true

// 3.
// console.log(1 == true && 0 == false);
// true


// var year = 2024;
// if (year == 2024){
//     console.log("올해");
// }
// 올해

// var year = 2024;
// var r = year == 2024 ? "올해" : "올해가 아닙니다";
// console.log(r);
// 올해

// Q. if 조건문, 삼항연산자 조건문
// 나이 변수에 따라서 사람이 성인인지 아닌지를 출력하는 조건문을 만들어 보세요
// 1. if / else문
// 2. 삼항연산자 조건문

// var age = 19;
// if (age>=20){
//     console.log("성인이 맞습니다");
// }else{
//     console.log("성인이 아닙니다");
// }
// 성인이 아닙니다

// var adult = age >= 20 ? "성인이 맞습니다" : "성인이 아닙니다";
// console.log(adult);
// 성인이 아닙니다


// var year = 2024;
// switch(year){
//     case 2023:
//         console.log("작년");
//         break;

//     case 2024:
//         console.log("올해");
//         break;
    
//     case 2025:
//         console.log("내년");
//         break;
// }

// var year = 2024;
// switch(year){
//     case 2023:
//         console.log("작년");
//         break;
//     default:
//         console.log("가까운 년이 아님")
// }

// Q. switch 조건문
// 아래 표를 활용하여 자동차의 이름을 입력하면 가격을 출력하는
// switch문을 만들어 보세요
//  

// var carName = prompt("자동차를 입력해주세요", "자동차");

// switch(carName){
//     case "아반떼 하이브리드":
//         console.log(2500);
//         break;
//     case "XM3 하이브리드":
//         console.log(3000);
//         break;
//     case "KONA":
//         console.log(4500);
//         break;
//     case "아이오닉6":
//         console.log(5000);
//         break;
//     default:
//         console.log("현재 판매하는 자동차가 아닙니다.");
// }

// for 반복문

// for(var n = 0; n < 10; ++n){
//     console.log(n+1 + "번 실행되었습니다.");
// }

// console.log(n);

// 사용 사례
// var sum = 0
// for(let i = 1; i<=10; i++){
//     sum += i;
// }
// console.log(sum);
// 55

// for(var i = 1; i<=10; i++){
//     if(i==5){
//         break;
//     }
//     console.log(i);
// }

// continue
// for (var i = 1; i <= 10; i++){
//     if(i==5){
//         continue;
//     }
//     console.log(i);
// }

// Q. for 문
//  1부터 10까지의 숫자 중 짝수만 출력하는 for문

// for(let i=1; i<=10; i++){
//     if(i%2==0){
//         console.log(i);
//     }
// }

// console.log("------------");
// for(let i=1; i<=10; i++){
//     if(i%2==1){
//         continue;
//     }
//     console.log(i);
// }

// console.log("------------");
// for(let i=2; i<=10; i += 2){
//     console.log(i);
// }

// while

// var n = 1

// while(n<=10){
//     console.log(n + "번 실행되었습니다.");
//     n++;
// }

// var n =1;
// while(true){
//     if(n==5){
//         break;
//     }
//     console.log(n);
//     n++
// }

// Q. while문
// 1부터 10까지의 합을 구하는 while

// var i = 1;
// var sum = 0;
// while(i<=10){
//     sum += i;
//     i++;
// }
// console.log(sum);

// function f(){
//     console.log("호출됨");
// }

// f();

// var f = function(){
//     console.log("호출됨");
// }

// f();

// function add (x,y){
//     console.log("결과 : ", x + y);
// }

// add(1,2);

// function add (x,y){
//     return x + y;
// }

// var r = add(1, 2);
// console.log(r);

// 콜백
// function f(callback) {
//     var foo = "bar";

//     callback(foo);
// }

// function cb(data){
//     console.log(data);
// }

// f(cb)

// function getTime(){
//     var time = new Date().toLocaleTimeString();
//     console.log(time);
// }

// setInterval(getTime, 1000);

// Q. 함수
// 나이 입력값에 따라서 사람이 성인인지 아닌지를 출력하는 함수

// var age = 19;

// function isAudlt(age){
//     if(typeof age != "number"){
//         console.log("숫자로 입력해주세요.");
//         return ;
//     }
//     if(age >=19){
//         console.log("성인");
//     }else{
//         console.log("미성년자");
//     }
// }

// isAudlt(age);

// Q. 함수
// 1부터 입력값 까지의 합을 반환하는 함수

// function f(num){
//     var sum2 = 0;
//     for(i=1; i<= num; i++){
//         sum += i;
//     }
//     console.log(sum);
// }

// f(3);
// console.log(sum2);

// var carList = ["볼보", "BMW", "현대", "토요타", "포드"];
// carList[3] = "기아"
// console.log(carList)

// Q. 배열 메서드
// 자동차 리스트에 새 차를 추가해보세요.
// var cars = ["스타리아", "그랜저", "아반뗴"];
// var newCar = "캐스퍼";

// cars.push(newCar);
// console.log(cars);

// Q. 배열 메서드
// 아시아 자동차 리스트를 만들어 보세요.
// var koreaCars = ["현대", "기아", "KG모빌리스"];
// var japenseCars = ["렉서스", "닛산", "스즈키"];
// var asiaCars = koreaCars.concat(japenseCars);
// console.log(asiaCars);


// 성인만 출력
// var ages = [12, 19 , 23 ,30];

// for(var i = 0 ; i <= ages.length; i++){
//     if(ages[i] >= 19){
//         console.log(ages[i]);
//     }
// }

// Q. 배열순회
// b로 시작하는 아이템만 출력해 보세요.
// var arr = ["foo", "bar", "baz"];

// for(var i = 0; i < arr.length; i++){
//     if(arr[i][0] == "b"){
//         console.log(arr[i]);
//     }
// }

// 

// var cat = {
//     name : "치즈",
//     home : null,
//     sound : function (){
//         return "야옹";
//     }
// }


// Q. 객체
// 다음을 만족하는 'korea'객체를 선언해보세요

// 속성
// -수도
// 서울
// - 인구
// 50000000
// - 언어
// 한국어
// - G7 여부
// 아니요
// 
// 메서드
// - k-pop 플이어
// kpop음악을 재생한다

// var korea = {
//     captitalCity : "서울",
//     population : 50000000,
//     language : 한국어,
//     isG7 : false,
//     kpop : function (){
//         return "kpop음악을 재생한다"
//     }
// }


// var cat = {
//     name : "치즈",
//     home : null,
//     sound : function (){
//         return "야옹";
//     }
// }

// console.log("name :", cat["name"]);

// console.log("sound :", cat.sound());

// var cat = {
//     name : "치즈",
//     home : null,
//     sound : function (){
//         return "야옹";
//     }
// }

// cat.age = 2;
// console.log(cat);


/*
    Q. 기본 사용방법
    아래의 리스트를 참고하여 2개의 문제를 풀어보세요

    1 판매중인 맥주의 이름만 출력해 보세요

    결과 :
    하이네켄
    버드와이저
    기린

    2. 기네스가 재입고 되었습니다. 리스트를 업데이트해보세요
*/


// Q1
// var beers = [
//     { name : "Guinness", available: false},
//     { name : "Heineken", available: true},
//     { name : "Budwuser", available: true},
//     { name : "kirin", available: true},
// ]

// for(i = 0; i<beers.length; i++){
//     if(beers[i].available){
//         // console.log(beers[i].name);
//         console.log(beers[i].name);
//     }   
// }

// Q2
// console.log("-------------")
// for(i = 0; i<beers.length; i++){
//     if(beers[i].name == "Guinness"){
//         beers[i].available = true;
//     }   
//     console.log(beers[i]);
// }


// class Beer{
//     name;
//     origin;
//     available;

//     constructor (name, origin, available){
//         this.name=name;
//         this.origin=origin;
//         this.available=available;
//     }

// }
// var irishBeer = new Beer("Guinness", "ireland", false);

// class Beer{
//     name;
//     origin;
//     available;

//     constructor (name, origin, available){
//         this.name = name;
//         this.origin = origin;
//         this.available = available;
//     }

//     drink(){
//         return "시원하다";
//     }

//     static history = "기원전 3000년 전";

//     static brewing(){
//         return "밀, 홉, 효모, 물 등";
//     }
// }

/* 클래스
    Q.
    아래를 만족하는 <Car> 클래스를 정의

    - 변수멤버
    name, brand, color

    - 생성자 있음

    - 함수 멤버
    자동차 소리를 낸다

    - statci 함수
    구매 연도를 입력하면 차의 나이를 말해준다
*/

// class Car{
//     name;
//     brand;
//     color;

//     constructor (name, brand, color){
//         this.name = name;
//         this.brand = brand;
//         this.color = color;
//     }

//     horn(){
//         return "빵빵"
//     }

//     static age(year) {
//         return 2024 - year;
//     }
// }

// 예외
// var password = "123";
// var input = "12";
// try{
//     if(input != password){
//         throw "비밀번호가 일치하지 않습니다"
//     }
//     console.log("로그인 성공");
// }catch(error){
//     console.log("로그인 실패: ", error)
// }

// function getData(callback){
//     setTimeout(function(){
//         callback(null, "야옹");
//     },1000);
// }

// getData(function(err, data){
//     if(err){
//         return console.error(err);
//     }
//     console.log("서버에서 받은 데이터 :", data);
// });

// console.log("다음 작업");


// var cat = { name : "치즈" } ;
// var cat_json = JSON.stringify(cat);

// console.log(cat_json);
// console.log(typeof cat_json)

// var cat_json = '{ "name" : "치즈" }';
// var cat = JSON.parse(cat_json);

// console.log(cat);
// console.log(typeof cat);




