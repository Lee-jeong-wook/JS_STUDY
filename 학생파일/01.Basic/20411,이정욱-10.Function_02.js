/**
 * 함수 선언문 함수 표현식
 * - 호이스팅과 스코프
 */
function sum(a,b){
    return `a+b = ${ a + b}`;
}
console.log(sum(1, 2));
// 함수 표현식
console.log(sum2(3, 5));
const sum2 = function(a, b){
    return `sum2 = ${ a + b}`
}

console.log(sum2(3, 5));