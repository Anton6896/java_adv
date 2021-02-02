package Design_patterns.bridge_pattern;

public abstract class EntertainmentDevice {
    int device_state;
    int max_settings;
    int volume_level = 0;

    abstract void button_five();

    abstract void button_six();

    void device_feedback() {
        if (device_state > max_settings || device_state < 0) {
            System.out.println("[EntertainmentDevice] -- " +
                    "On channel (device state) " + device_state);
        }
    }

    void button_seven() {
        System.out.println("[EntertainmentDevice]  -- volume at " +
                (++volume_level));
    }

    void button_eight() {
        System.out.println("[EntertainmentDevice] -- volume at " +
                (--volume_level));
    }

}
