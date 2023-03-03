package day5;

public class MethodLab2 {
	public static void main(String[] args) {
		int rand1, rand2;
		
		for(int n=1;n <= 5;n++) {
			rand1 = (int)(Math.random()*30)+1;
			rand2 = (int)(Math.random()*30)+1;
			System.out.printf("%d 와 %d 의 차는 %d 입니다.\n", 
					       rand1, rand2, difference(rand1, rand2));			
		}		
	}
	static int difference(int num1, int num2) {
		if(num1 > num2)
			return num1 - num2;
		else
			return num2 - num1;
	}
}
