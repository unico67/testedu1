package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] obj = new Plane[2];
		obj[0] = new Airplane("L747",1000);
		obj[1] = new Cargoplane("C40",1000);
		
		printInfo(obj);
		
		obj[0].flight(100);
		obj[1].flight(100);
		
		System.out.println("\n[ 100 운항  ]");
		printInfo(obj);
		
		obj[0].refuel(200);
		obj[1].refuel(200);
		
		System.out.println("\n[ 200 주유  ]");
		printInfo(obj);

	}
	public static void printInfo(Plane[] list) {
		System.out.println("Plane\t\tfuelSize");
		System.out.println("-------------------------");
		/*System.out.println(list[0].getPlaneName()+"\t\t"+list[0].getFuelSize());
		System.out.println(list[1].getPlaneName()+"\t\t"+list[1].getFuelSize());	*/
		for(Plane p : list)
			System.out.println(p.getPlaneName()+"\t\t"+p.getFuelSize());
	}

}
