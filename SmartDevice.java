// SmartDevice.java
public abstract class SmartDevice {
    protected int id;
    protected String status;

    public SmartDevice(int id) {
        this.id = id;
        this.status = "off"; // Default status is off
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract String getStatus();
    public int getId() {
        return id;
    }
}