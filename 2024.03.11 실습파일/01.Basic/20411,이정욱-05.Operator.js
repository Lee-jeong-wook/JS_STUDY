/**
 * 논리 연산자(Logical Operator)
 * ||(논리합): OR
 * &&(논리곱): AND
 * !(논리부정): NOT
 */

console.log(null || 2 || undefined);
// js에서 null과 undefined는 false, 0 제외 숫자는 true
// 2만 true이므로 2를 출력

console.log(1 && null && 2);
// => true && false && true => null
console.log(!!false);
/**
 * 단축평가(Short circuit evaluation)
 * - 표현식 평가 중에 평가 결과가 확정되면 나머지 평가 과정을 생략
 * - 논리합(||)과 논리곱(&&) 연산자는 논리 연산의 결과를 결정한 피연산자를 타입 변환하지 않고 반환
 * - 항상 boolean형을 반환하는 not 연산자와 달리 or과 and 연산자는 논리 연산의 결과를 결정하는 피연산자를 형 변환 없이 그대로 반환
 * 
 * && 사용 시 좌측이 true => 우측 값을 반환
 * && 사용시 좌측이 false => 좌측 값 반환
 * || 사용 시 좌측이 true => 좌측 값 반환ㄱ
 * || 사용 시 좌측이 false => 우측 값 반환
 */
console.log("d" && false);

const emptyStr = "";
console.log(emptyStr == false);
console.log(emptyStr && false);
console.log(false || "coffee");
console.log(0 || false || "JS" || !2);
console.log(true || "any");

// ||, && 연산자는 왼쪽부터 오른쪽으로 평가를 진행하는데 중간에 평가 결과가 나오면 오른쪽 끝까지 가지 않고 평과 결과를 반환

/**
 * 모두 false
 * 1) 아무 글자 없는 String
 * 2) 값이 없는 경우(null, undefined)
 * 3) 0
 */

/**
 * ES11 옵셔널 체이닝 연산자(Optional Chaining Operator) => ?.
 * - 앞의 평가 대상이 undefined이거나 null이면 평가를 멈추고 undefined를 반환
 * - 존재하지 않을 수 있는 프로퍼티 또는 메서드를 안전하게 호출할 수 있도록 도와줌
 */

console.log("====");
let e = null;
let r1 = e && e.value;
console.log(r1);
let r2 = e?.value;
console.log(r2);