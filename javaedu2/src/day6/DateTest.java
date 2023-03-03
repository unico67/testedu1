package day6;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));
		System.out.println(gc.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.println(gc.get(GregorianCalendar.MONTH));
		System.out.println(gc.get(GregorianCalendar.HOUR));
		System.out.println(gc.get(GregorianCalendar.MINUTE));
		System.out.println();		
		gc = new GregorianCalendar(2022, 11, 25);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
		
		gc = new GregorianCalendar(2022, 11, 3);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
	}
}
