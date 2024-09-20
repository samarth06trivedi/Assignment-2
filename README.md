# Assignment-2
1. SmartDevice.java
  Declares an abstract parent class to encompass the various kinds of smart devices-Light, Thermostat, DoorLock.
  Commonly defined attributes : id, status and methods : turnOn(), turnOff(), getStatus() in this class, which the subclasses implement.
2. SmartDeviceFactory.java
  Implementing the Factory pattern, which creates various kinds of smart devices: Light, Thermostat, DoorLock.
  It centralizes the logic regarding the creation of a particular type of smart device.
3. Light.java, Thermostat.java, DoorLock.java
  Each is a concrete subclass that fulfills the implementation of the specified behavior of a given type of device.
  Explain how each device gets on/off and status.
4. SmartHomeHub.java
  It is the central hub for all devices.
  It has some features such as control devices to turn them on/off, define a schedule, define a trigger, and notify all devices of status changes by implementing the Observer Pattern
5. SmartDeviceProxy.java
  implements the Proxy Pattern, layering control in accessing all devices
  By using such a proxy layer it allows control which may be checking before turning devices on/off or permit it before turning them on/off
6. Main.java
  The simulation program which is primarily designed to demonstrate the functionality of the smart home system.
  Initialization: Initializes the hub, creates devices using the factory, controls devices through proxies and sets up schedules and triggers.
