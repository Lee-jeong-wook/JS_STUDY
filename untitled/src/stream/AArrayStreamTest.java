package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AArrayStreamTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        for(int i : a){
            System.out.println(i);
        }

        Arrays.stream(a).forEach(s -> System.out.println(s));

        int total = Arrays.stream(a).sum();
        System.out.println(total);

        //정수형 스트림 만들기
        //스트림은 한 번 사용하면 사라진다.
        IntStream is = Arrays.stream(a);
        System.out.println(is.sum());
        
        //소모된 스트림은 코딩할때 소모여부를 알 수가 없다
        //믄밥작 오류는 없으나 실ㄹ행에서 예외
        total = Arrays.stream(a).filter(c->c%2 == 0).sum();
    }
}
