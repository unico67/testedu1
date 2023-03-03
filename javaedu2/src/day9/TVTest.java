package day9;

public class TVTest {

	public static void main(String[] args) {
		// 클래스 객체 각각 생성
		TV saletv = new SaleTV(300000,"SALETV-1",40,1);
		TV rentaltv = new RentalTV(100000,"RENTALTV-10",42,1);
		RentalTV rentaltv2 = new RentalTV(100000,"RENTALTV-10",42,1);
		
		// sale tv의 채널을 높임
		saletv.channelUp();
		saletv.channelUp();
		
		// rental tv의 채널을 내림
		rentaltv.channelDown();
		rentaltv.channelDown();
		rentaltv.channelDown();
		
		// 각 객체에 대해 printAllTV() 호출
		printAllTV(saletv);
		printAllTV(rentaltv);
		
		// printRentalTV() 호출
		printRentalTV((Rentable)rentaltv);	
		printRentalTV((RentalTV)rentaltv);		
		printRentalTV(rentaltv2);	
	}
	
	static void printAllTV(TV tv) {
		
		if (tv instanceof SaleTV) {
			System.out.println(tv.toString());
			((SaleTV) tv).play();
			((SaleTV) tv).sale();
		}
		else if(tv instanceof RentalTV) {
			System.out.println(tv.toString());
			((RentalTV) tv).play();
		}
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}

}
