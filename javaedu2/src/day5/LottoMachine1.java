package day5;

public class LottoMachine1 {

	public static void main(String[] args) {
		// CASE1
		int[] lotto = new int[6];

		Loop1: for (int i = 0; i < lotto.length; i++) {
			int num = (int) (Math.random() * 6) + 1;

			for (int j = 0; j < i; j++) {
				if (lotto[j] == num) {
					i--;
					continue Loop1;
				}
			}
			lotto[i] = num;
		}

		System.out.printf("오늘의 로또 번호 - %d, %d, %d, %d, %d, %d ", lotto[0], lotto[1], lotto[2], lotto[3], lotto[4],
				lotto[5]);
		// CASE2
		System.out.println();
		System.out.print("오늘의 로또 번호 - ");
		lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 6) + 1;
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length - 1) {
				System.out.print(lotto[i]);
			} else {
				System.out.print(lotto[i] + ",");
			}
		}

		// CASE3
		System.out.println();

		System.out.print("오늘의 로또 번호 - ");

		int[] nums = new int[6];
		int idx = 0;
		do {
			int x = (int) (Math.random() * 6 + 1);
			if ((x != nums[0]) && (x != nums[1]) && (x != nums[2]) && (x != nums[3]) && (x != nums[4])
					&& (x != nums[5])) {
				nums[idx] = x;
				idx++;

			}
		} while (idx <= 5);

		for (int i = 0; i < nums.length; i++) {
			if (i == 5) {
				System.out.print(nums[i]);
			} else {
				System.out.print(nums[i] + ",");
			}
		}
	}
}
