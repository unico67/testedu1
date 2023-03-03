package day5;

public class ArrayLab4 {

	public static void main(String[] args) {
		// CASE1
		int num = (int) (Math.random() * 6) + 5;
		int[] ary = new int[num];
		for (int i = 0; i < ary.length; i++) {
			int n = (int) (Math.random() * 26) + 1;
			ary[i] = n;
			// 출력
			if (i == ary.length - 1) {
				System.out.println(ary[i]);
				break;
			}
			System.out.print(ary[i] + ",");
		}
		char[] charary = new char[num];
		for (int i = 0; i < ary.length; i++) {
			charary[i] = (char) (ary[i] + 96);

			// 출력
			if (i == ary.length - 1) {
				System.out.println(charary[i]);
				break;
			}
			System.out.print(charary[i] + ",");
		}
		// CASE2
		num = (int)(Math.random()*6)+5;
		ary = new int[num];
		char[] ary2 = new char[num];
		
		for(int i=0; i<num; i++) {
			int res = (int)(Math.random()*26)+1;
			ary[i] = res;
			ary2[i] = (char)(res+96);
		}
		
		for(int i=0; i <num; i++) {
			System.out.print(ary[i]);
			if (i!=num-1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		for(int i=0; i <num; i++) {
			System.out.print(ary2[i]);
			if (i!=num-1) {
				System.out.print(", ");
			}
		}		
	}
}
