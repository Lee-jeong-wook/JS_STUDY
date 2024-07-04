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

/**
 * Object(객체): key(이름) 과 value(값)로 구성된 property(요소)의 집합
 * - primitive type을 제외한 나머지는 모두 Object
 * - 데이터와 그 데이터에 관련된 동작을 함께 묶는것

 * 객체 생성 방법
 * 1) 객체 리터럴로 생성하는 방법
 * 2) 생성자로 생성하는 방법
 * 3) Object.create로 생성하는 방법
 * 
 * Array와 Object의 차이는 배열은 순서를 가지고 객체는 의미를 가짐
*/
const tv = {
    brand:"LG",
    width:200,
    height:80,
    color:"black",
    on:function(){
        console.log("tv 켜짐");
    },
    mute:function(){
        console.log("소리가 ㅇ음소거 되었습니다");
    }
}

//객체 리터럴
const student = {
    name : "짱구",
    age : 18,
    hello:function(){
        console.log("짱구님 안녕하세요");
    },
    hello2:function(){
        console.log(`${this.name}님 안녕하세요`)
    }
    //arrow function은 this 값이 자신이 아닌 외부의 값을 가져옴                      
}
console.log(Object.values(student));
student.hello();
student.hello2();

//2) 생성자로 생성하는 방법
// 빈 객체를 생성한 후 프로퍼티 추가, 멤버 메서드, 객체 메서드 등 추가
const newStudent = new Object();
newStudent.name = "철수";
newStudent["age"] = 18;
newStudent.hello = function(){
    console.log(`${this.name}님 안녕하세요`)
}
console.log(newStudent);
newStudent.hello();

const NewStudent = function(name, age){
    this.name = name;
    this.age = age;
    this.hell0 = function(){
        console.log(`${this.name}님 안녕하세요`)
    }
}
const sefObj = new NewStudent("유리", 18);
console.log(sefObj);

// 3) Object.create로 생성하는 방법
// 프로타입 상속을 통해 ㄱ객체를 만드는 방법

// 부모 객체 생성
const parent = {
    name: "봉미선",
    age: 29,
    hello:function(){
        console.log(`${this.name}님 안녕하세요`);
    }
}
const child = Object.create(parent);
child.name = "짱구";
console.log(child);
child.hello();

/**
 * const로 선언한 객체의 측징
 * 1. 객체 자체 변경이 불가능
 * 2. 객체 안의 프로퍼티나 메서드 변경이 가능
 */
const gildong = {
    name: "홍길동",
    group: "2학년4반",
};

// 모든 키를 다 가져오는 메서드
console.log(Object.keys(gildong));
console.log(Object.values(gildong));
// 모든 키와 밸류 가져오기
console.log(Object.entries(gildong));