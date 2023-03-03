package day7;

import java.util.Scanner;

class SalaryExpr{
	int bonus;	
	SalaryExpr(){
		bonus = 0;
	}	
	SalaryExpr(int bonus){
		this.bonus = bonus;
	}	
	int getSalary(int grade) {
		int result = 0;
		switch(grade) {		
		case 1:
			result = bonus + 100;
			break;
		case 2:
			result = bonus + 90;
			break;
		case 3:
			result = bonus + 80;
			break;
		case 4:
			result = bonus +  70;
		}
		return result;
	}
}

public class SalaryExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월을 입력하세요 (1~12): ");
		int month = sc.nextInt();
		
		System.out.print("등급을 입력하세요 (1~4): ");
		int grade = sc.nextInt();
		/*SalaryExpr salExp;		
		if (month % 2 == 0) {
			salExp = new SalaryExpr(100);			
		}
		else {
			salExp = new SalaryExpr();				
		}
		System.out.printf("%d월 %d등급의 월급은 %d입니다.",month,grade,salExp.getSalary(grade));*/
		if (month % 2 == 0) {
			System.out.printf("%d월 %d등급의 월급은 %d입니다.",month,grade,new SalaryExpr(100).getSalary(grade));	
		}
		else {
			System.out.printf("%d월 %d등급의 월급은 %d입니다.",month,grade,new SalaryExpr().getSalary(grade));				
		}
		sc.close();
	}
}



