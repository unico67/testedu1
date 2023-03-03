package day10;

class One {
	public String toString(int n) {
		return "One 클래스의 객체임";
	}
}
class Two {
	@Override     // Annotation 구문, 애노테이션 구문
	public String toString() {
		return "Two 클래스의 객체임";
	}
}
class Three {	
}

public class AnnoTest {
	public static void main(String[] args) {
		System.out.println(new One());
		System.out.println(new Two());
		System.out.println(new Three());
	}
}
