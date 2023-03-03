package day8;

class MyObject {
	
}

class OtherObject {	
	public String toString() {
		return super.toString() + " - OtherObject 클래스의 객체임!!";
	}	
}

public class MyObjectTest {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		System.out.println(obj.toString());
		OtherObject obj2 = new OtherObject();
		System.out.println(obj2.toString());
		java.util.Date obj3 = new java.util.Date(); // toString() 메서드를 재정의(overriding)
		System.out.println(obj3.toString());
		//System.out.println(obj3.toLocaleString());
	}
}
