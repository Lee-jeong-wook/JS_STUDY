package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;
class CompareAge implements BinaryOperator<String> {

    @Override
    public String apply(String s, String u) {
        if( s.length() > u.length())
            return u;
        else
            return s;
    }
}

public class ArrayListStream {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();

        sList.add("messi");
        sList.add("ronaldo");
        sList.add("Sonny");
        sList.add("Ferdinand");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.println(s));

        sList.stream().forEach(s-> System.out.println(s));

        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.println(s));

        System.out.println();

        //글자가 5보다 작은 아이들
        sList.stream().filter(s -> s.length() <= 5).forEach(s -> System.out.println(s));

        System.out.println(sList.stream().count());


        System.out.println(sList.stream().filter(s -> s.length() == 5).count());

        //list를 스트링 배욜로 만들기
        String[] sArray = new String[4];
        for(int i = 0; i < sList.size(); i++){
            sArray[i] = sList.get(i);
        }

        String s;
        s = Arrays.stream(sArray).reduce(new CompareAge()).get();

        System.out.println(s);
    }
}
