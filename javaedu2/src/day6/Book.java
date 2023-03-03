package day6;

public class Book{
	String title;
	String author;
	int price;
	
	public Book(){
		title = "Do it!, 자바 프로그래밍 입문";
		author = "박응종";
		price = 23000;
	}
	public Book(String p1, String p2, int p3){
		title = p1;
		author = p2;
		price = p3;
	}
	
	String getBookInfo() {
		return title+"  "+author+"  "+price;
	}
}
