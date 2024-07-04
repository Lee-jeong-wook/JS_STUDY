package stream;

import java.util.*;
import java.util.function.BinaryOperator;


//class CompareAge implements BinaryOperator<Integer>{
//    @Override
//    public Integer apply(Integer t, Integer u) {
//        if(t > u)
//            return u;
//        else
//            return t;
//    }
//}
class moneyComparater implements Comparator<Object>{

    @Override
    public int compare(Object o1, Object o2) {
        //무엇을 비교할지 정확히 몰라서 ㅒㅠㅓㄷㅊㅅ
        //Object를 매개변수
        //반드시 강제 형변환
        int money1 = ((Student)o1).getMoney();
        int money2 = ((Student)o2).getMoney();
        //리턴에서 첫번째 매개변수 - 두번쨰는 오름
        //두번째 - 첫번째 내림차순
        return money1 - money2;
    }
}
public class StudentTest {
    public static void main(String[] args) {
        Student yoon = new Student("윤지상", 16, 20000);
        Student Kim = new Student("김영호", 16, 1000);
        Student hong = new Student("홍의준", 15, 1500);

        List<Student> sList = new ArrayList<Student>();
        sList.add(hong);
        sList.add(yoon);
        sList.add(Kim);

        sList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
        System.out.println(sList.stream().mapToInt(c -> c.getMoney()).sum());

        //16살인 학생 출력
        sList.stream().filter(c -> c.getAge() == 16).map(c -> c.getName()).forEach(s -> System.out.println(s));

        sList.stream().filter(c -> c.getAge() == 16).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));

        System.out.println();
        Collections.sort(sList);
        sList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        System.out.println("학생 섞기");
        Collections.shuffle(sList);
        sList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        System.out.println();
        Collections.sort(sList, new moneyComparater());
        sList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        System.out.println("학생의 나이순으로 이름을 내림차순으로 출력하기");
        Collections.reverse(sList);
        sList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
        

    }
}