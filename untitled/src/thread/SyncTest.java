package thread;

//Critical section, Semaphore
//Critical section 은 두개이상의 thread 가 동시에 하나의 자원을 접근할 때 문제가 생길 수 있으므로
// 동시에 접근 못 할 영역을 만드는데 그 영역이 Critical section
//semaphore 는 특별한 형태의 시스템 객체이고, semaphore 를 가지는 thread 는 critical section 에 접근 가능
//semaphore 는 get 과 release 메소드로 조ㄱ절
//한순간에 오직 하나의 thread 만이 semaphore 를 얻을 수 있다
//나머지는 대기상태로 들어간다.

//동기화 (Synchronization)
//2개의 thread가 같은 객체에 접근할 경우 동시에 접근함으로 해서 생기는 오류가 발생할 수 있다
//동기화는 임계영역에 접근한 경우 공유 자원을 lock시켜서 다른 thread의 접근을 제한한다.
//동기화를 잘못 구현하면 deadlock에 빠진다.
//java에서는 synchronized 메서드나 synchronized 블럭을 사용할 수 있다
class Bank{
    private int money = 10000;

    private void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void saveMoney(int money){
        int m = getMoney();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        setMoney(m+money);
    }

    public void minusMoney(int money){
        int m = getMoney();

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        setMoney(m-money);
    }

}
class Bank2{
    private int money = 10000;

    private void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public synchronized void saveMoney(int money){
        int m = getMoney();
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        setMoney(m+money);
    }

    public synchronized void minusMoney(int money){
        int m = getMoney();

        try {
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }
        setMoney(m-money);
    }

}
class Lee extends Thread{
    public void run() {
        System.out.println("lee started");
        SyncTest.myBank.minusMoney(1000);
        SyncTest.myBank2.minusMoney(1000);
        System.out.println("minus 1000(MyBank): " + SyncTest.myBank.getMoney());
        System.out.println("minus 1000(MyBank2): " + SyncTest.myBank2.getMoney());
    }
}
class Kim extends Thread{
    public void run() {
        System.out.println("Kim started");
        SyncTest.myBank.saveMoney(1000);
        SyncTest.myBank2.saveMoney(1000);
        System.out.println("save 1000(MyBank): " + SyncTest.myBank.getMoney());
        System.out.println("save 1000(MyBank2): " + SyncTest.myBank2.getMoney());
    }
}
public class SyncTest {
    public static Bank myBank = new Bank();
    public static Bank2 myBank2 = new Bank2();
    public static void main(String[] args) {
        Lee lee = new Lee();
        lee.start();
        try {
            Thread.sleep(3000);
        }catch (Exception e){

        }
        Kim kim = new Kim();
        kim.start();
    }
}
