/**
 * JS 변수 생성 단계
 * 1. Declaration(선언): JS 엔진에 변수 객체를 등록하는 단계
 * 2. Initialization(초기화)
 * - 변수 객체에 값을 저장하기 위한 메모리 공간을 확보하는 단계
 * - 암묵적으로 undefined로 초기화된 변수에 실제 값을 할당하는 단계
 * 3. Assignment(할당): undefined로 초기화된 변수에 실제 값을 할당하는 단계
 * 
 * 변수 선언하기
 * var(ES5) => Function Scope(범위 함수 내부)
 * let => Block Scope(범위: 블록{} 내부)
 * const => Block Scope(범위: 블록{} 내부)
 */

// 참조형 변수 list
const list = ["a", "b","c","d" ];
// const fruit = "banana";
// fruit = "apple";
list.push("P");
const arr = [1, 2, 3];
const arr2 = [1, 3, 2];
arr = arr2;

//const를 사용한다고 해서 수정 X 는 아님
//const로 선언된 배열이나 오브젝트의 값을 변경은 가능하지만 참조 변경은 X