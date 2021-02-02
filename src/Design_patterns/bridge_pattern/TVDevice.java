package Design_patterns.bridge_pattern;

public class TVDevice extends EntertainmentDevice {

    public TVDevice(int device_state_, int max_settings_) {
        super.device_state = device_state_;
        super.max_settings = max_settings_;
    }

    @Override
    void button_five() {
        System.out.println("[TVDevice ] -- Chanel down  ");
        device_state--;
    }

    @Override
    void button_six() {
        System.out.println("[TVDevice  ] -- Chanel Up  ");
        device_state++;
    }

}

