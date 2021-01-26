package Design_patterns.command_pattern;

public class CommandTester {
    public static void main(String[] args) {

        ElectronicDevice device_tv = TvRemote.get_device();
        device_tv.set_name("pazitron");  // optional addition

        DeviceTurnOn on_command = new DeviceTurnOn(device_tv);
        DeviceVolumeDown volume_command = new DeviceVolumeDown(device_tv);

        DeviceButton button = new DeviceButton(on_command);
        DeviceButton button_2 = new DeviceButton(volume_command);

        System.out.println("new tv created : " + device_tv);
        button.press();
        button_2.press();
        button_2.press();
        button_2.undo();

    }
}
