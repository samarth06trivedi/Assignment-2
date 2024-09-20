public class Main {
    public static void main(String[] args) {
        SmartHomeHub hub = new SmartHomeHub();

        // Creating devices via the Factory pattern
        SmartDevice light = SmartDeviceFactory.createDevice(1, "light");
        SmartDevice thermostat = SmartDeviceFactory.createDevice(2, "thermostat");
        SmartDevice door = SmartDeviceFactory.createDevice(3, "door");

        // Adding devices to the hub
        hub.addDevice(light);
        hub.addDevice(thermostat);
        hub.addDevice(door);

        // Controlling devices through the Proxy
        SmartDevice lightProxy = new SmartDeviceProxy(light);
        SmartDevice thermostatProxy = new SmartDeviceProxy(thermostat);

        lightProxy.turnOn(); // Proxy controlling access
        thermostatProxy.turnOn();

        // Setting a schedule
        hub.scheduleDevice(1, "turnOff", "22:00");

        // Adding a trigger
        hub.addTrigger("temperature > 75", "turnOff(1)");

        // Notify all devices of the current status
        hub.notifyDevices();
    }
}
