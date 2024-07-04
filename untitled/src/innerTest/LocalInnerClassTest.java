package innerTest;
class Outer{
    int outNum = 100;
    static int sNum = 200;

    //메서드 안에 innerClass
    Runnable getRunnable(int i){
        int num = 100;
        class MyRunnable implements Runnable{
            @Override
            public void run() {
//                지역면수 num은 이렇게 만드는 경우 상수가 되어 변경 불가
//                num += 10;
//                int i = 100;
//                i = i + num;
//                call by valye로 넘어온 지역변수 i도 변경 불가
//                지역변수 num과 i는 메서드가 끝나면 사용할 수 없으나
//                Runnable은 반환 이후에도 사용 가능하기 때문에 java에서 사용할 수 없도록
                System.out.println(i);
                System.out.println(outNum);
                System.out.println(sNum);
            }
        }
        return new MyRunnable();
    }
}

public class LocalInnerClassTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(50);
        runnable.run();
    }
}
