package day6;

class StudentNew {
	String name;
	int age;
	String subject;
	
	StudentNew() {
		name = "턱시";
		age = 40;
		subject = "리눅스";
	}
	
	StudentNew(String n, int a, String s) {
		name = n;
		age = a;
		subject = s;
	}
	
	void printStudentInfo() {
		System.out.printf("%s학생의 나이는 %d입니다.\n", name, age);
	}
	void study() {
		System.out.printf("%s학생은 %s과목을 학습합니다.\n", name, subject);
	}
}

public class StudentTest2 {
	public static void main(String[] args) {		
		StudentNew stn1 = new StudentNew("듀크", 26, "HTML5");
		stn1.printStudentInfo();
		stn1.study();
		
		StudentNew stn2 = new StudentNew("둘리", 10, "자바");
		stn2.printStudentInfo();
		stn2.study();		
		
		StudentNew stn3 = new StudentNew();
		stn3.printStudentInfo();
		stn3.study();		
	}
}




