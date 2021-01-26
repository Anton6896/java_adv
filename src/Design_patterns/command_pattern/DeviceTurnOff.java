package Design_patterns.command_pattern;

public class DeviceTurnOff implements Command {

    ElectronicDevice electronicDevice;

    public DeviceTurnOff(ElectronicDevice newDevice) {
        electronicDevice = newDevice;
    }

    @Override
    public void execute() {
        electronicDevice.off();
    }

    @Override
    public void undo() {
        electronicDevice.on();
    }
}
