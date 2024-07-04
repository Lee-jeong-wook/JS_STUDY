/**
 * Data type
 * JS는 Primitive Type과 Object TYpe을 가짐
 * - Primitive Type
 * 1. Number
 * 2. String
 * 3. Boolean
 * 4. undefined
 * 5. null
 * 6. symbol
 * 
 * -Object Type
 * 1. function
 * 2. Array
 * 3. RexExp
 * 
 */

const age = 18;
// console.log(typeof(age));

// 6. Symbol Type
// 유일무이한 값 생성
// Symbol 함수를 호출
// => 객체의 프로퍼티 키를 고유하게 설정함으로써 프로퍼티 키의 충돌을 방지하기 위해 사용
const t1 = "1";
const t2 = "1";
console.log(t1 === t2);
const s1 = Symbol("1");
const s2 = Symbol("1");
console.log(s1 === s2)
/**
 * Dynamic Type(동적 타이팡): 편수의 타입을 명시적으로 선언하지 않고 값에 의해 추론
 * 런타임시 결정
 * pyhton, js, php, ruby
 * 
 * Static Typing(정적 타이핑): 변수 선언할 때 어떤 타입의 변수를 선언할지 명시
 * 컴파일시 결정
 * -JAVA, C, C++
 */
