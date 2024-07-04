package thread;

//Thread 우선순위
//THread.Min_priority(=1),
//THread.Min_priority(=10),
//우선순위는 1부터 10까지
//우선순위가 높다라는 뜻은 CPU를 오래 차지할 가능성이 높다.
//setPriority로 우선순위를 변경할 수 ㅇ있다
class PriorityThread extends Thread{
    @Override
    public void run() {
        int sum = 0;
        //현재 쓰레드 가져오기
        Thread t = Thread.currentThread();

        System.out.println(t + "\t" + "start");
        for (int i = 0; i <= 100000; i++) {
            sum += i;
        }
        System.out.println(t + "\t" + sum);
        System.out.println(t + "\t" + "ended");
    }
}
public class PriorityTest {
    public static void main(String[] args) {
        int i = 0;
        for(i = Thread.MIN_PRIORITY; i<=Thread.MAX_PRIORITY; i++){
            PriorityThread pt = new PriorityThread();
            pt.setPriority(i);
            pt.start();
        }
    }
}
