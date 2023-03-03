package mobile;

public class Otab extends Mobile {
    public Otab(){};

    public Otab(String mobileName, int batterysize, String osType){
    	super(mobileName, batterysize, osType);
    }
    @Override  // annotation 구문 - 좀더 견고한 프로그램을 구현할 수 있게 도와준다.
    public void operate(int time){
        setBatterySize(getBatterySize()-12*time);

    }
    @Override
    public void charge(int time){
        setBatterySize(getBatterySize()+8*time);
    }

}

