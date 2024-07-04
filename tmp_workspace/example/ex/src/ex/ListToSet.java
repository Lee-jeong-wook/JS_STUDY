package ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		
		list.add("김영호");
		list.add("김지효");
		list.add("김영호");
		list.add("김지효");
		list.add("박민규");
		list.add("신권호");
		list.add("신민석");
		list.add("윤지상");
		
		//스트링처럼 특별한 객체로 출력하면 list 형태로 주소가 아니라 데이터가 출력
		System.out.println(list);
		
		ListIterator<String> li = list.listIterator();
		
		System.out.println("순차적 순회");
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("역방향 순회");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
		//list와 set의 차이점? set은 중복할 수 없다.
		HashSet<String> hSet = new HashSet<>();
		hSet.addAll(list);
		System.out.println("해쉬셋 출력");
		System.out.println(hSet);
		
		TreeSet<String> tSet = new TreeSet<>();
		tSet.addAll(list);
		System.out.println(tSet);
	}

}
