/**
 * Hoisting
 * 변수를 뒤에서 선언하지만 위에서 선언한 것처럼 인식
 * var, function들을 어느 위치에 호출하던 그 선언들을 맨 위로 끌어올림
 * - let const도 Hoisting 됨
 * var눈 선언과 초기화가 한번에
 */

// var 키워드(선언 & 초기화 => 할당)
console.log(subject1);
var subject1 = "JS";

//var키워드로 선언한 변수의 경우 호이스팅 시, undefined로 변수 초기화
// 2. let키워드(선언 => TDZ=>초기화=>할당)
// TDZ(Tempral Dead Zone) 일시적 사각지대: 스코프의 시작점부터 초기화 시작점까지의 구간
console.log(subject2);
let subject2 = "JS";

// => let, const는 호이스팅이 가능하지만 TDZ영역에 같혀있어 발생하지 않는 것처럼 보임