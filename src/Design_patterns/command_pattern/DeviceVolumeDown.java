package Design_patterns.command_pattern;

public class DeviceVolumeDown implements Command {
    ElectronicDevice device;

    public DeviceVolumeDown(ElectronicDevice device) {
        this.device = device;
    }


    @Override
    public void execute() {
        device.volume_down();
    }

    @Override
    public void undo() {
        device.volume_up();
    }
}
