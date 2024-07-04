package ex;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextDouble());
		System.out.println(r.nextFloat());
		
		Random r2 = new Random(236);
		Random r3 = new Random(236);
		
		System.out.println();
		
		System.out.println("첫번쨰 객체");
		for(int i = 0; i < 10; i++) {
			System.out.println(r2.nextInt());
		}
		
		System.out.println("두번쨰 객체");
		for(int i = 0; i < 10; i++) {
			System.out.println(r3.nextInt());
		}
	}

}
