package day6;

public class MethodLab4 {
	public static void main(String[] args) {
		// CASE1
		System.out.println("가장 큰 값은 "+ maxNumArray(new int[] {10,20,30}) + " 입니다.");
		System.out.println("가장 큰 값은 "+ maxNumArray(new int[] {100,500,300,200,400}) + " 입니다.");
		System.out.println("가장 큰 값은 "+ maxNumArray(new int[] {1,10,3,4,5,8,7,6,9,2}) + " 입니다.");
		System.out.println();
		// CASE2
		int[][] a = {
						{10, 20, 30},
						{100, 500, 300, 200, 400},
						{1, 10, 3, 4, 5, 8, 7, 6, 9, 2}
					};
		for(int i=0;i<a.length;i++) {
			System.out.println("가장 큰 값은 "+maxNumArray(a[i])+"입니다.");
		}
	}
	static int maxNumArray(int[] a) {
		int biggest = 0;
		for(int e: a) {
			if(e > biggest) 
				biggest = e;
		}
		return biggest;
	}
}










