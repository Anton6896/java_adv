package Design_patterns.bridge_pattern;

public abstract class EntertainmentDevice {
    int device_state;
    int max_settings;
    int volume_level = 0;

    /* will differ depend for device */
    abstract void button_five();

    abstract void button_six();


    /* the 7,8 is same functionality to all devices */
    void button_seven() {
        System.out.println("[EntertainmentDevice]  -- volume at " +
                (++volume_level));
    }

    void button_eight() {
        System.out.println("[EntertainmentDevice] -- volume at " +
                (--volume_level));
    }

    void device_feedback() {
        // error check for device state
        if (device_state > max_settings || device_state < 0) {
            System.out.println("[EntertainmentDevice] -- " +
                    "cant do that " + device_state);
        }
    }
}
