package innerTest;
//내부 클래스는 클래스 안에서 내부적으로 사용할 클래스를 선언
//외브 클래스에 생성된 이후에 내부클래스가 생성
//내부 클래스에 static이 있으면 내부클래스보다 static이 먼저 생성되어야 해서
//jdk 16이전에는 오류가 발생하였으나 그 이후 버전에서는 완화되어 오류가 생기지는 않지만
//static을 사용하려면 static으로 그 클래스를 정의하는 것을 권장한다
//https://bugs.openjdk.org/browse/JDK-8254321

//내부클래스의 종류에는
//인스턴트 내부클래스, 정적 내부클래스, 지역 내부클ㄹ래스, 익명 내부클래스
class OutClass{
    private int num =10;
    private static int sNum = 20;
    private InClass inClass;
    public OutClass(){
        inClass = new InClass();
    }
     class InClass{
        int iNum = 100;
        static int isNum = 200;
        void test(){
            System.out.println(num);
            System.out.println(sNum);
            System.out.println(isNum);
        }
     }
     public void unsignedInner(){
        inClass.test();
     }

     static class InStaticClass {
        int num = 100;
        //static은 실햄하면 맨처음 모두 static 영역에 변수를 생성하는데 outClass에도 isNum이 있고 inStatic Class에도 isNum이 있어서 한 static에 같은 이름의 두개의 변수를 만들 수 없다
        static int inSNum = 200;
        void inTest(){
            System.out.println(num);
            System.out.println(inSNum);
        }
     }
}
public class InnerTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        outClass.unsignedInner();
        OutClass.InStaticClass myinstaticClass = new OutClass.InStaticClass();
        System.out.println();
        myinstaticClass.inTest();
        System.out.println();

//        innerClass로 생성하더라도 outClass에서 선언한 변수들을 접근가능하다
        OutClass.InClass myClass = outClass.new InClass();
        myClass.test();
    }
}
