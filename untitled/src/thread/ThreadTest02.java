package thread;
class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.print(i + "\t");
        }
    }
}

public class ThreadTest02 {
    public static void main(String[] args) {
        //어디에서, 우선순위, thread가 속한 곳
        System.out.println(Thread.currentThread() + " started");
        MyThread2 runnable = new MyThread2();
        //thread를 생성할 때 내가 만든 runnablr을 매개변수 인자로 만들어서 실향
        Thread mt = new Thread(runnable);
        Thread mt2 = new Thread(runnable);
        mt.start();
        mt2.start();
        System.out.println(Thread.currentThread() + "ended");
        //runnable을 생성해서 Thread를 만들고 실행
        Runnable rn = new Runnable() {
            @Override
            public void run() {
                System.out.println(" run");
            }
        };
        rn.run();
    }
}
