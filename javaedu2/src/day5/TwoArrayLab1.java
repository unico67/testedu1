package day5;

public class TwoArrayLab1 {

	public static void main(String[] args) {
		// CASE1
		int arry[][] = new int[4][4];
		int val = 10;
		for (int i = 0; i < arry.length; i++) {
			for (int j = 0; j < arry[0].length; j++) {
				arry[i][j] = val;
				val += 2;
			}
		}
		System.out.println("1행 1열의 데이터 : " + arry[0][0]);
		System.out.println("3행 4열의 데이터 : " + arry[2][3]);
		System.out.println("행의 갯수 : " + arry.length);
		System.out.println("열의 갯수 : " + arry[0].length);
		System.out.print("3행의 데이터들 : ");

		for (int col = 0; col < arry[0].length; col++)
			System.out.print(arry[2][col] + " ");

		System.out.print("\n2열의 데이터들 : ");
		for (int row = 0; row < arry.length; row++)
			System.out.print(arry[row][1] + " ");

		System.out.print("\n왼쪽 대각선 데이터들 : ");
		for (int i = 0; i < arry.length; i++)
			System.out.print(arry[i][i] + " ");

		System.out.print("\n오른쪽 대각선 데이터들 : ");
		for (int i = 0; i < arry.length; i++)
			System.out.print(arry[i][3 - i] + " ");
		System.out.println("\n=========================");
		// CASE2
		int[][] ary = new int[4][4];
		int num = 10;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				ary[i][j] = num;
				num += 2;
			}
		}
		System.out.println("1행 1열의 데이터 : " + ary[0][0]);
		System.out.println("3행 4열의 데이터 : " + ary[2][3]);
		System.out.println("행의 갯수 : " + ary.length);
		System.out.println("열의 갯수 : " + ary[0].length);
		System.out.print("3행의 데이터들 : ");
		for (int i = 0; i < 4; i++) {
			System.out.print(ary[2][i] + " ");
		}
		System.out.println();
		System.out.print("2열의 데이터들 : ");
		for (int i = 0; i < 4; i++) {
			System.out.print(ary[i][1] + " ");
		}
		System.out.println();
		System.out.print("왼쪽 대각선 데이터들 : ");
		for (int i = 0; i < 4; i++) {
			System.out.print(ary[i][i] + " ");
		}
		System.out.println();
		System.out.print("오른쪽 대각선 데이터들 : ");
		for (int i = 3; i >= 0; i--) {
			System.out.print(ary[3 - i][i] + " ");
		}
		System.out.println("\n=========================");
		// CASE3
		int[][] two = { { 10, 12, 14, 16 }, { 18, 20, 22, 24 }, { 26, 28, 30, 32 }, { 34, 36, 38, 40 } };
		System.out.println("1행 1열의 데이터:" + two[0][0]);
		System.out.println("3행 4열의 데이터:" + two[2][3]);
		System.out.println("행의 갯수:" + two.length);
		System.out.println("열의 갯수:" + two[0].length);

		System.out.print("3행의 데이터들 : ");
		for (int i = 0; i < two.length; i++) {
			System.out.print(two[2][i] + " ");
		}
		System.out.println();

		System.out.print("2열의 데이터들 : ");
		for (int i = 0; i < two.length; i++) {
			System.out.print(two[i][1] + " ");
		}
		System.out.println();

		System.out.print("왼쪽 대각선 데이터들 : ");
		for (int i = 0; i < two.length; i++) {
			System.out.print(two[i][i] + " ");
		}
		System.out.println();
		System.out.print("오른쪽 대각선 데이터들 : ");
		for (int i = 0; i < two.length; i++) {
			System.out.print(two[i][two.length - 1 - i] + " ");
		}
	}
}
