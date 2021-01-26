package Design_patterns.command_pattern;

// class that create an job , an specific implementation of command !
// telling to some device to do some thing

public class DeviceTurnOn implements Command {
    ElectronicDevice electronicDevice;  // get some device to work with

    public DeviceTurnOn(ElectronicDevice device) {
        electronicDevice = device;
    }


    // using a device through the commands
    @Override
    public void execute() {
        electronicDevice.on();
    }

    @Override
    public void undo() {
        electronicDevice.off();
    }
}
