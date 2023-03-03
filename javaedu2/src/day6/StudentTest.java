package day6;

class Student {
	String name;
	int age;
	String subject;
	
	void printStudentInfo() {
		System.out.printf("%s학생의 나이는 %d입니다.\n", name, age);
	}
	void study() {
		System.out.printf("%s학생은 %s과목을 학습합니다.\n", name, subject);
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		//System.out.println(st1.name);
		//System.out.println(st1.age);
		//System.out.println(st1.subject);
		//st1.printStudentInfo();
		//st1.study();
		st1.name = "듀크";
		st1.age = 26;
		st1.subject = "HTML5";
		st1.printStudentInfo();
		st1.study();
		
		Student st2 = new Student();
		System.out.println(st2);
		st2.name = "둘리";
		st2.age = 10;
		st2.subject = "자바";
		st2.printStudentInfo();
		st2.study();
		System.out.println("st2 = st1 수행");
		st2 = st1;
		System.out.println(st1);
		System.out.println(st2);
		st2.printStudentInfo();
		st2.study();		
	}
}
