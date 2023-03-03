package day6;

class Member{
	String name;
	String account;
	String password;
	int birthyear;
}
public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();
		
		m1.name = "듀크";
		m1.account = "abc123";
		m1.password = "123";
		m1.birthyear = 19960101;
		
		m2.name = "홍길동";
		m2.account = "zxc12";
		m2.password = "12";
		m2.birthyear = 19981011;
		
		m3.name = "강감찬";
		m3.account = "asd123";
		m3.password = "12345";
		m3.birthyear = 19871012;
		
		System.out.printf("회원1:%s(%s,%s,%d)", m1.name,m1.account,m1.password,m1.birthyear);
		System.out.println();
		System.out.printf("회원2:%s(%s,%s,%d)", m2.name,m2.account,m2.password,m2.birthyear);
		System.out.println();
		System.out.printf("회원3:%s(%s,%s,%d)", m3.name,m3.account,m3.password,m3.birthyear);

	}

}
