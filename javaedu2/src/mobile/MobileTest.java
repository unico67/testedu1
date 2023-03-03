package mobile;

public class MobileTest {
    public static void main(String args[]){
        // 각각의 Mobile 객체를 생성한다.
        Mobile mob1 = new Ltab("Ltab", 500, "ABC-01");
        Mobile mob2 = new Otab("Otab", 1000, "XYZ-20");
        // 생성된 객체의 정보를 출력한다 (printMobile()호출)
        printTitle();
        printMobile(mob1);
        printMobile(mob2);
        // 각각의 Mobile 객체에 10분씩 충전을 한다.
        mob1.charge(10);
        mob2.charge(10);
        // 10분 충전 후 객체 정보를 출력한다. (위와 동일)
        printTitle();
        printMobile(mob1);
        printMobile(mob2);
        // 각각의 Mobile 객체에 5분씩 통화를 한다.
        mob1.operate(5);
        mob2.operate(5);
        // 5분 통화 후 객체 정보룰 출력한다. (위와 동일)
        printTitle();
        printMobile(mob1);
        printMobile(mob2);
    }

    public static void printMobile(Mobile mobile){
        System.out.println(mobile.getMobileName() +"      "+ mobile.getBatterySize() +"      "+ mobile.getOsType());
    }
    public static void printTitle(){
        System.out.println(" Mobile   Battery    OS");
        System.out.println("--------------------------- ");
    }
}
