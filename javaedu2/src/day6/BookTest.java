package day6;


public class BookTest {

	public static void main(String[] args) {
		Book b1 = new Book();
		Book b2 = new Book("Do it! 자바스크립트 입문", "박응종",21000);
		Book b3 = new Book("자바의 정석","남궁성",30000);
		Book b4 = new Book("혼자공부하는자바","신용권",21000);
		Book b5 = new Book("자바의 정석 기초","남궁성",23000);
		
		System.out.println(b1.getBookInfo());
		System.out.println(b2.getBookInfo());
		System.out.println(b3.getBookInfo());
		System.out.println(b4.getBookInfo());
		System.out.println(b5.getBookInfo());
	}
}
