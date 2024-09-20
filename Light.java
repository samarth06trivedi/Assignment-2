// Light.java
public class Light extends SmartDevice {
    public Light(int id) {
        super(id);
    }

    @Override
    public void turnOn() {
        status = "on";
        System.out.println("Light " + id + " is turned on.");
    }

    @Override
    public void turnOff() {
        status = "off";
        System.out.println("Light " + id + " is turned off.");
    }

    @Override
    public String getStatus() {
        return "Light " + id + " is " + status;
    }
}

