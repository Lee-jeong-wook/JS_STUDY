/**
 * Data Types(데이터 타입)
 * 자바스크립트는 6개의 Primitive Type(원시 타입)과 1개의 Object Type(객체 타입)을 가짐
 * - Primitive Type => immutable value(변경이 불가능한 값)
 *  1. Number
    2. String
    3. boolean
    4. undefined
    5. null
    +추가 6.symbol

 * - Object Type => mutable value(변경 가능한 값)
    1. function, 2. Array, 3. RegExp ...
 */

/**
 * Object(객체): key(이름)와 value(값)로 구성된 property(요소)의 집합
 * - Primitive type(원시 타입)을 제외한 나머지는 모두 Object type(객체 타입)
 * - 데이터와 그 데이터에 관련된 동작을 함께 묶는것
 *
 * 객체 생성 방법
 * 1) 객체 리터럴로 생성하는 방법
 * 2) 생성자로 생성하는 방법
 * 3) Object.create로 생성하는 방법
 *
 * Array와 Object 차이? => 배열은 순서를 가지고 객체는 의미를 가짐
 */

const tv = {
  brand: "LG",
  witdh: 200,
  height: 80,
  color: "black",
  on: function () {
    console.log("TV가 켜졌습니다.");
  },
  mute: function () {
    console.log("소리가 음소거 되었습니다.");
  },
};

// 1) 객체 리터럴로 생성하는 방법
const student = {
  name: "짱구",
  age: 18,
  hello: function () {
    console.log("짱구님 안녕하세요.");
  },
  hello2: function () {
    // this: 함수에 정의되어있는 객체를 가리킴
    console.log(`${this.name}님 안녕하세요.`);
  },
  // arrow function은 this값이 자신이 아닌 외부의 값을 가져옴
};

console.log("1번:", Object.values(student));
student.hello();
student.hello2();

//2) 생성자로 생성하는 방법
// 빈 객체를 생성한 후 프로퍼티 추가, 멤버 메서드, 객체 메서드 등 추가
const newStudent = new Object();
newStudent.name = "철수";
newStudent["age"] = 18;
newStudent.hello = function () {
  console.log(`${this.name}님 안녕하세요.`);
};
console.log("2번:", newStudent);
newStudent.hello();

const NewStudent = function (name, age) {
  this.name = name;
  this.age = age;
  this.hello = function () {
    console.log(`${this.name}님 안녕하세요.`);
  };
};
const selfObj = new NewStudent("유리", 18);
console.log("2번:", selfObj);

// 3) Object.create로 생성하는 방법
// 프로타입 상속을 통해 객체를 만드는 방법

// 부모 객체 생성
const parent = {
  name: "봉미선",
  age: 29,
  hello: function () {
    console.log(`${this.name}님 안녕하세요.`);
  },
};

const child = Object.create(parent);
child.name = "짱구";
console.log("3번째", child);
child.hello();

/**
 * const로 선언한 객체의 특징
 * 1. 객체 자체 변경이 불가능
 * 2. 객체 안의 프로퍼티나 메서드는 변경이 가능
 */

const gilDong = {
  name: "홍길동",
  group: "2학년4반",
};

// 모든 key를 다 가져오기
console.log(Object.keys(gilDong));

// 모든  value 다 가져오기
console.log(Object.values(gilDong));

// 모든 key, value 다 가져오기
console.log(Object.entries(gilDong));
