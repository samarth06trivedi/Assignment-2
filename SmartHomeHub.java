// SmartHomeHub.java
import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void removeDevice(SmartDevice device) {
        devices.remove(device);
    }

    public void notifyDevices() {
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public void scheduleDevice(int id, String command, String time) {
        // Implement scheduling logic (mocked here)
        System.out.println("Scheduled: Device " + id + " to " + command + " at " + time);
    }

    public void addTrigger(String condition, String action) {
        // Implement trigger logic (mocked here)
        System.out.println("Trigger added: " + condition + " will execute " + action);
    }

    public void controlDevice(int id, String command) {
        for (SmartDevice device : devices) {
            if (device.getId() == id) {
                if (command.equalsIgnoreCase("turnOn")) {
                    device.turnOn();
                } else if (command.equalsIgnoreCase("turnOff")) {
                    device.turnOff();
                }
            }
        }
    }
}

