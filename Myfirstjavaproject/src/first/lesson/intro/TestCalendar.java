package first.lesson.intro;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy HH:mm:ss");
//		String date = sdf.format(new Date());
//		System.out.println(date);
		
		Date now = new Date();
	
		System.out.println(now.toString());
		System.out.println((DateFormat.getInstance().format(now)));
		System.out.println(DateFormat.getTimeInstance().format(now));
		System.out.println(DateFormat.getDateTimeInstance().format(now));
		System.out.println(DateFormat.getTimeInstance(DateFormat.SHORT).format(now));
		System.out.println(DateFormat.getTimeInstance(DateFormat.MEDIUM).format(now));
		System.out.println(DateFormat.getTimeInstance(DateFormat.LONG).format(now));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(now));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.SHORT).format(now));
		System.out.println(DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(now));
		
		
		
//		sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
//		String dateInString = "31-08-1982 10:20:56";
//		Date dateobj = sdf.parse(dateInString);
//		System.out.println(dateobj);
//		System.out.println("====================================");
		
//		Calendar calendar = Calendar.getInstance();
//		dateobj = calendar.getTime();
//		System.out.println(dateobj);
	}

}



