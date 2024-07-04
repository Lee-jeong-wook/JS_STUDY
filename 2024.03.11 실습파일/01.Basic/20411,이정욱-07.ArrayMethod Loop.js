const fruit = ["banana", "apple", "grape", "mango"];
let cnt = 0;
while(cnt !== fruit.length){
    console.log(fruit[cnt]);
    cnt++;
}
for( let i = 0; i < fruit.length; i++){
    console.log(fruit[i]);
}
// 1. forEach: 오직 Array 객체에서만 사용 가능
// -breack, continue, return 구문 사용해서 함수 벗어나기 C
// - 반환값 X, 단순 for문과 같이 작동

//배열 참조변수명.forEach(function(){

// }){
fruit.forEach(function(item){
    console.log(item);
})
fruit.forEach(function(item, index){
    console.log(`${index}번쨰${item}`);
})
// 2. for of :iterable 속성을 가지고 있는 컬렉션(Array, Map, Set...) 전용 반벅 구문(ES6)
// -iterable: member를 하나씩 차례로 반환 가능한 object

/**
 * for(let 변수 of 참조배열변수명){
 *  
 * }
 */
for(let item of fruit){
    console.log("과일" + item);
}
// 3. for in 객체의 모든 열거 가능한 속성에 대해서 반복
for(let item in fruit){
    console.log("과일" + item);
}