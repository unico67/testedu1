package mobile;

public class Ltab extends Mobile {
    public Ltab(){};

    public Ltab(String mobileName, int batterysize, String osType){
        super(mobileName, batterysize, osType);
    }

    public void operate(int time){
        setBatterySize(getBatterySize()-10*time);
    }

    public void charge(int time){
        setBatterySize(getBatterySize()+10*time);

    }
}

