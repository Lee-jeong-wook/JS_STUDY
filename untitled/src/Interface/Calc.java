package Interface;

public interface Calc {
    double PI = 3.14;   //interface에서 변수 선언하면 무조건 상수로 변경
    int Error = -99999;

    int add(int num1, int num2);
    int substract(int num1, int num2);
    int multi(int num1, int num2);
    double divide(int num1, int num2);

//    인터페이스의 메소드는 default로 선언가능하다.
    default void description(){
        System.out.println("정수 계산기 구현");
    }

}
