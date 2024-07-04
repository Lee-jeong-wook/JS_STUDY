package innerTest;
class Outer2{
    int outNum = 100;
    static int sNum = 200;

    Runnable getRunnable(int i){
        int num = 100;

        return new Runnable() {
            @Override
            public void run() {
                System.out.println(i);
                System.out.println(num);
                System.out.println(outNum);
                System.out.println(sNum);
            }
        };
    }
//    단 하나의 인터페이스이거나 추상클래스인 경우에는 익명 이너 클래스를 사용 가능
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("test");
        }
    };
}
public class AnonymousInnerClassTest {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Runnable runnable = outer.getRunnable(30);
        runnable.run();

        Runnable runner = outer.runner;
        runner.run();
    }
}
