package day11;

public class Person {
	//클래스 내에서만 사용가능한 멤버변수
	private String name;
	
	//기본 생성자
	Person(String name){
		this.name = name;
	}
	
	//어디서든 사용가능한 메서드
	public String getInfo(){
		return name;
	}
}