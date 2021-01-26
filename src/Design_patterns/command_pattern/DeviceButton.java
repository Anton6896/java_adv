package Design_patterns.command_pattern;

public class DeviceButton {
    Command command;

    public DeviceButton(Command new_command) {
        command = new_command;
    }

    void press() {
        command.execute();
    }

    void undo() {
        command.undo();
    }
}
