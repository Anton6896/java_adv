package Design_patterns.command_pattern;

public class DeviceTurnOn implements Command {
    ElectronicDevice electronicDevice;

    public DeviceTurnOn(ElectronicDevice device) {
        electronicDevice = device;
    }

    @Override
    public void execute() {
        electronicDevice.on();
    }

    @Override
    public void undo() {
        electronicDevice.off();
    }
}
