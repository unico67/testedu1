package day5;

public class MethodLab1 {
	public static void main(String[] args) {
		printDecoWithNum('@', 3);
		printDecoWithNum('%', 4);
		printDecoWithNum('A', 5);
		printDecoWithNum('가', 3);
	}

	static void printDecoWithNum(char deco, int num) {
		for (int n = 1; n <= num; n++)
			System.out.print(deco);
		System.out.println();
	}
}
