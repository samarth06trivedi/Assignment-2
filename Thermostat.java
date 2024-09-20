// Thermostat.java
public class Thermostat extends SmartDevice {
    private int temperature;

    public Thermostat(int id) {
        super(id);
        this.temperature = 70; // Default temperature
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + id + " is set to " + temperature + " degrees.");
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat " + id + " is on at " + temperature + " degrees.");
    }

    @Override
    public void turnOff() {
        System.out.println("Thermostat " + id + " is off.");
    }

    @Override
    public String getStatus() {
        return "Thermostat " + id + " is set to " + temperature + " degrees.";
    }
}
