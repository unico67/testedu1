package day7;

class Product {
	String name;
	int balance;
	int price;
	Product() {
		this("듀크인형", 5, 10000);
	}
	Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
	}
	// getter
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int getPrice() {
		return price;
	}
}

public class ProductTest {
	public static void main(String[] args) {
		Product[] prod = new Product[5];

		prod[0] = new Product();
		prod[1] = new Product("스폰지밥 인형", 10, 15000);
		prod[2] = new Product("피카츄 인형", 8, 7000);
		prod[3] = new Product("잠만보 인형", 3, 13500);
		prod[4] = new Product("라이언 인형", 23, 18000);
		
		//for(Product p : prod) 
		//	System.out.println(p);

		for (int i = 0; i < prod.length; i++) {
			System.out.printf("%s  %d개  %,d원\n", prod[i].getName(), prod[i].getBalance(), prod[i].getPrice());
		}
		
		for (Product p : prod) {
			System.out.printf("%s  %d개  %,d원\n", p.getName(), p.getBalance(), p.getPrice());
		}
	}
}
