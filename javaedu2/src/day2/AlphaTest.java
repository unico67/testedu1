package day2;

public class AlphaTest {
	public static void main(String[] args) {
		int num = (int) (Math.random() * 26) + 1;

		System.out.println("추출된 숫자 : " + num);
		System.out.println((char)(64 + num));

	}
}
