/**
 * 타입변환
 * 1. Explict Coercion(명시적 타입 변환): 개발자가 의도적으로 값의 타입을 변환하는 것
 * 2. Implict Coercion(암묵적 타입 변환): 런타임 시에 JS엔진이 코드 문맥에 맞게 자동으로 변환하는 것
 */

const number = 7
const str = number.toString();
const m1 = Number("0원");
const m2 = parseInt("0원");
console.log(m1, m2);

//암묵적
console.log("98" + 2);
console.log("98" * 2);

let str2 = "";
console.log(typeof(str2));

let str3 = null;
console.log(typeof str3);