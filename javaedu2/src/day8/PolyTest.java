package day8;

public class PolyTest {
	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("가나다"));
		printObjectInfo("ABC");  // 문자열, String 클래스의 객체
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:/"));
		printObjectInfo(new int[10]);
		printObjectInfo(new double[3]);
		printObjectInfo(100); // int   ---> java.lang.Integer Java 5 AutoBoxing
		printObjectInfo('가'); // char ---> java.lang.Character Java 5 AutoBoxing
		printObjectInfo(new day6.Book());
		printObjectInfo(new Person("유니코")); 
		printObjectInfo(new Friend("유니코", "1234", "unicodaum"));
	}
	static void printObjectInfo(Object o) {
		if (o instanceof String) {
			System.out.println("문자열 객체가 전달됨 : " + o.getClass().getName() + " - " +
		                                     ((String)o).length());           
		} else {
			System.out.println("전달된 객체의 클래스명 : " + o.getClass().getName());
		}
	}
}
