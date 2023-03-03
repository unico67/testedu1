package day11;

import java.util.LinkedList;
public class LinkedListLab1 {
	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<>();
		list.add(new Friend("홍길동", "01012345678", "ghdrlfehd@naver.com"));
		list.add(new Friend("김듀크", "01037294774", "rlaebzm@naver.com"));
		list.add(new Friend("박둘리", "01032974834", "qkrenffl@naver.com"));
		list.add(new Friend("이쿼크", "01043798587", "dlznzjm@daum.net"));
		list.add(new Friend("김영희", "01023497732", "alshdls@gmail.com"));
		System.out.println("이름         전화번호         메일주소");
		System.out.println("--------------------------------------------");
		for (Friend f : list) {
			System.out.printf("%s\n", f.getInfo());
		}
	}
}
