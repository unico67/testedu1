package day5;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		// CASE1
		char arr[][] = { { 'B', 'C', 'A', 'A' }, { 'C', 'C', 'B', 'B' }, { 'D', 'A', 'A', 'D' }, };

		int counts[] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				char ch = arr[i][j];
				if (ch == 'A') {
					counts[0]++;
				} else if (ch == 'B') {
					counts[1]++;
				} else if (ch == 'C') {
					counts[2]++;

				} else {
					counts[3]++;
				}
			}
		}

		for (int i = 0; i < counts.length; i++) {
			System.out.println((char) (65 + i) + "는" + counts[i] + "개 입니다.");
		}
		System.out.println("=========================");
		// CASE2
		char[][] ary1 = { { 'B', 'C', 'A', 'A' }, { 'C', 'C', 'B', 'B' }, { 'D', 'A', 'A', 'D' } };
		int[] arr1 = new int[4];

		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				switch (ary1[i][j]) {
				case 'A':
					arr1[0]++;
					break;
				case 'B':
					arr1[1]++;
					break;
				case 'C':
					arr1[2]++;
					break;
				default:
					arr1[3]++;
					break;
				}
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			//char x = (char) (65 + i);
			System.out.printf("%c 는 %d개 입니다.\n", 65 + i, arr1[i]);
		}
	}
}
