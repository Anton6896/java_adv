package Design_patterns.command_pattern;

public interface ElectronicDevice {
    // concept of any electronic device
    void on();
    void off();
    void volume_up();
    void volume_down();
    void set_name(String new_name);
}
