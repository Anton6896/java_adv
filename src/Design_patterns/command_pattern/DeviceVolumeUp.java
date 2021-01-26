package Design_patterns.command_pattern;

public class DeviceVolumeUp implements Command {

    ElectronicDevice device;

    public DeviceVolumeUp(ElectronicDevice new_device) {
        device = new_device;
    }


    @Override
    public void execute() {
        device.volume_up();
    }

    @Override
    public void undo() {
        device.volume_down();
    }
}
