var __spreadArray = (this && this.__spreadArray) || function (to, from, pack) {
    if (pack || arguments.length === 2) for (var i = 0, l = from.length, ar; i < l; i++) {
        if (ar || !(i in from)) {
            if (!ar) ar = Array.prototype.slice.call(from, 0, i);
            ar[i] = from[i];
        }
    }
    return to.concat(ar || Array.prototype.slice.call(from));
};
// ...파라미터 (무한히 들어올 수 있는 매개변수)
// rest parameter
function 함수8() {
    var v = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        v[_i] = arguments[_i];
    }
    console.log(v);
}
함수8(1);
함수8(1, 2, 3, 4, 'a', 'b');
// 
var arr1 = [1, 2, 3];
var arr2 = ['a', 'b', 'c'];
var arr3 = __spreadArray(__spreadArray([], arr1, true), arr2, true);
console.log(arr3);
var _a = ['hello', 300], 변수1 = _a[0], 변수2 = _a[1];
var _b = { key1: true, key2: 30 }, key1 = _b.key1, key2 = _b.key2;
var obj08 = { key1: true, key2: 30 };
