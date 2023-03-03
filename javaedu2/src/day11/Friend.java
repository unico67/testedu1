package day11;

public class Friend extends Person {
	
	String phoneNum;
	String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo(){
		String str = String.format("%s       %s     %s", super.getInfo(), phoneNum, email); 

		return str;
	}

}
