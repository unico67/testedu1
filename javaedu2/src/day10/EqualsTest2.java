package day10;

public class EqualsTest2 {
	public static void main(String[] args) {	
		String s1 = "가나다";
		String s2 = "가나다";
		String s3 = new String("가나다");
		String s4 = new String("가나다");
		
		System.out.println(s1 == s2);
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));		
	}
}
