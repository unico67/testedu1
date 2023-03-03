package day8;

class Person {
	private String name;
	
	Person(String name){
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	private String phoneNum;
	private String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);		
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo() {
		return super.getInfo() + "\t" + phoneNum + "\t" + email;
	}	
}

public class FriendTest {

	public static void main(String[] args) {
		
		Friend[] f = new Friend[5];
		f[0] = new Friend("AAA", "010aaaaaaaa", "aaaa@naver.com");
		f[1] = new Friend("BBB", "010bbbbbbbb", "bbbb@daum.net");
		f[2] = new Friend("CCC", "010cccccccc", "cccc@google.co.kr");
		f[3] = new Friend("DDD", "010dddddddd", "dddd@naver.com");
		f[4] = new Friend("EEE", "010eeeeeeee", "eeee@naver.com");
		
		System.out.println("이름\t전화번호\t메일주소");
		System.out.println("------------------------------------------------------------------------");
		
		for(int i=0; i<f.length; i++)
			System.out.println(f[i].getInfo());
		
		for(Friend obj : f) 
			System.out.println(obj.getInfo());		
	}
}
