package Design_patterns.bridge_pattern;

public class DVDdevice extends EntertainmentDevice {

    public DVDdevice(int device_state, int max_settings) {
        this.device_state = device_state;
        this.max_settings = max_settings;
    }


    @Override
    void button_five() {
        System.out.println("Dvd device -> next chapter");
        device_state++;
    }

    @Override
    void button_six() {
        System.out.println("previous chapter -> prev chapter");
        device_state--;
    }
}
