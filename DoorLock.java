// DoorLock.java
public class DoorLock extends SmartDevice {
    public DoorLock(int id) {
        super(id);
        this.status = "locked"; // Default status for door is locked
    }

    @Override
    public void turnOn() {
        status = "locked";
        System.out.println("Door " + id + " is locked.");
    }

    @Override
    public void turnOff() {
        status = "unlocked";
        System.out.println("Door " + id + " is unlocked.");
    }

    @Override
    public String getStatus() {
        return "Door " + id + " is " + status;
    }
}
