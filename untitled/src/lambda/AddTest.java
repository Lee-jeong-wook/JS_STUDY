package lambda;

//JAVA 8에서부터 함수형 프로그래밍 지원
// 함수의 구현과 수행으로 프로그램이 구성되어 있는 것이 함수형 프로그램

//형식
//(매개변수) -> (명령문)
//매개변수가 하나만 있는 경우
// 괄호 없이 매개변수 -> (명령문)
//// 실행문 하나 (매개변수) -> 실행문
// 실행문이 retun문만 있는 경우 return 생략 가능
// (매개변수 둘) -> 값
public class AddTest {
    public static void main(String[] args) {
        Add add = (a, b) -> a + b;
        System.out.println(add.add(10, 20));

        MyPrint myP = s -> System.out.println(s);
        myP.myPrint("sdc");

        String s1 = "용산구";
        String s2 = "회나무로";

        StringConcatImpl sci = new StringConcatImpl();
        sci.makeString(s1, s2);
        
        //람다식
        StringConcat sc = (s3, s4) -> System.out.println(s1 + " " + s2);
        sc.makeString(s1, s2);

        System.out.println();

        //메인에서 구현
        StringConcat sc2 = new StringConcat(){

            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1 + s2);
            }
        };
        sc2.makeString(s1, s2);
    }
}
