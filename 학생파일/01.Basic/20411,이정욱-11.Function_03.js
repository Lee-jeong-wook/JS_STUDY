/**
 * arguments: 매개변수가 없는 함수 정의문에서 참조하는 배열 변수
 * 
 * !주의 aRROW FUNCTION으로 정의 시 ARGUMENTS 사용 X
 */
const total = function(){
    let i = 0;
    let sum = 0;
    for(i = 0; i < arguments.length; i++){
        console.log(arguments[i]);
        sum += arguments[i];
        console.log(sum);
    }
    return sum;
}
console.log(total(100, 200, 300));