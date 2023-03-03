package day6;

public class MethodLab3 {

	public static void main(String[] args) {
		// CASE1
		for(int i=1;i<=5;i++)
			System.out.print((i!= 5) ? getRandom(10)+"," : getRandom(10));
		
		System.out.println();
			
		for(int j=1;j<=5;j++)
			System.out.print((j!= 5) ? getRandom(10,20)+",": getRandom(10,20));
		
		System.out.println("\n");
		// CASE2
		for(int i = 0; i < 5; i++) {
			if(i == 4) {
				System.out.print(getRandom(10));
			}
			else {
				System.out.print(getRandom(10)+",");
			}
		}
		System.out.println();
		for(int i = 0; i < 5; i++) {
			if(i == 4) {
				System.out.print(getRandom(10,20));
			}
			else {
				System.out.print(getRandom(10,20)+",");
			}
		}
	}	
	public static int getRandom(int n) {
		return (int)(Math.random()*n+1);
	}	
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1)+n1);
	}
}














