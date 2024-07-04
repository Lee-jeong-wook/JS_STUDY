package ex;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		Date today = new Date();
		cal.setTime(today);
		//다양한 날짜 출력
		System.out.println(cal.get(Calendar.ERA) );
		System.out.println(cal.get(Calendar.YEAR) );
		System.out.println(cal.get(Calendar.MONTH) + 1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) );
		System.out.println(cal.get(Calendar.DAY_OF_YEAR) );
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) );
		System.out.println(cal.get(Calendar.DATE) );
		System.out.println(cal.get(Calendar.HOUR) );
		System.out.println(cal.get(Calendar.HOUR_OF_DAY) );
		
	}

}
