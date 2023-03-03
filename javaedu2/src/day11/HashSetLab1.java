package day11;

import java.util.HashSet;

public class HashSetLab1 {

	public static void main(String[] args) {
		 HashSet<Integer> set = new HashSet<>();
		 int x;
		 while(set.size() < 10) {
			 x = (int)(Math.random() * (30 - 10 + 1))+ 10;
			 set.add(x);
		 }
		 System.out.print("오늘의 로또 번호:"+ set);
	}

}
