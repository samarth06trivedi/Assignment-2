// SmartDeviceProxy.java
public class SmartDeviceProxy extends SmartDevice {
    private SmartDevice realDevice;

    public SmartDeviceProxy(SmartDevice realDevice) {
        super(realDevice.getId());
        this.realDevice = realDevice;
    }

    @Override
    public void turnOn() {
        // Add access control logic here (e.g., user authentication)
        System.out.println("Access granted to turn on device " + id);
        realDevice.turnOn();
    }

    @Override
    public void turnOff() {
        // Add access control logic here (e.g., user authentication)
        System.out.println("Access granted to turn off device " + id);
        realDevice.turnOff();
    }

    @Override
    public String getStatus() {
        return realDevice.getStatus();
    }
}
