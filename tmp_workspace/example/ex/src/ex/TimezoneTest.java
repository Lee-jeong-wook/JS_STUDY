package ex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimezoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeZone tz;
		Date date = new Date();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		tz = TimeZone.getTimeZone("Greenwich");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));
		
		tz = TimeZone.getTimeZone("Asia/Seoul");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));
		
		tz = TimeZone.getTimeZone("America/LosAngeless");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));
		
		tz = TimeZone.getTimeZone("Asia/Pyongyang");
		df.setTimeZone(tz);
		System.out.println(tz.getDisplayName() + " " + df.format(date));
	}

}
