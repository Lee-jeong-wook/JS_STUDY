package thread;
//Thread란?
//Precess실행중인 프로그램은 OS로부터 메모리를 할당받아서 프로세스 상태가 된다
//thread 프로세스는 하나 이상의 thread를 사지게 되고 실제 작업을 수행하는 단위가 thread 이다

//multi-threading
//여러 thread가 동시에 수행되는 프로그램
//여러 작업이 동시에 실행되는 효과를 가져
//thread는 각자 자신의 공간을 가짐
// 각 thread간에 공유하는 자원이 있을 수 있다
// 여러 thread 간에 자원을 공유해서 작업이 수행되는 경우에는 서로 자원을 차지하려고 하는 경우가 발생할 수 있다
// 여러 thread가 자원을 공유하는 경우에 경쟁상태가 발생하는 경우 그 부분을 Critical section(임계영역) 이라고 한다
//Critical section에 대한 동기화(일종의 순차적 수해행)을 구현하지 않으면 오류가 발생할 수 있다
//자바에서 syncronized method를 사용한다
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()  + "\t"+ i);
        }
    }
}
public class ExThread{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + " started");
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
        System.out.println(Thread.currentThread() + " ended");
    }

}
