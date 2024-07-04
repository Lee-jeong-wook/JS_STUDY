package thread;


public class JoingTest extends Thread{
    int start;
    int end;
    int total;
    public JoingTest(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        int i;
        for (i = start; i <= end ; i++) {
            total += i;

        }
    }

    public static void main(String[] args) {
        JoingTest jt1 = new JoingTest(1, 1000);
        JoingTest jt2 = new JoingTest(1001, 2000);
        JoingTest jt3 = new JoingTest(2001, 3000);
        JoingTest jt4 = new JoingTest(3001, 4000);
        JoingTest jt5 = new JoingTest(4001, 5000);
        JoingTest jt6 = new JoingTest(5001, 6000);
        JoingTest jt7 = new JoingTest(6001, 7000);
        JoingTest jt8 = new JoingTest(7001, 8000);
        JoingTest jt9 = new JoingTest(8001, 9000);
        JoingTest jt10 = new JoingTest(9001, 10000);
        jt1.start();
        jt2.start();
        jt3.start();
        jt4.start();
        jt5.start();
        jt6.start();
        jt7.start();
        jt8.start();
        jt9.start();
        jt10.start();
        try {
            jt1.join();
            jt2.join();
            jt3.join();
            jt4.join();
            jt5.join();
            jt6.join();
            jt7.join();
            jt8.join();
            jt9.join();
            jt10.join();
        }catch (Exception e){

        }
        int joinTotal = jt1.total + jt2.total +jt3.total +jt4.total +jt5.total +jt6.total +jt7.total +jt8.total +jt9.total +jt10.total;
        System.out.println(jt1.total);
        System.out.println(jt2.total);
        System.out.println(jt3.total);
        System.out.println(jt4.total);
        System.out.println(jt5.total);
        System.out.println(jt6.total);
        System.out.println(jt7.total);
        System.out.println(jt8.total);
        System.out.println(jt9.total);
        System.out.println(jt10.total);

        System.out.println(joinTotal);

    }
}
