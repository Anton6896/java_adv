package Design_patterns.bridge_pattern;

public abstract class RemoteButton {
    private EntertainmentDevice entertainmentDevice;

    public RemoteButton(EntertainmentDevice entertainmentDevice) {
        this.entertainmentDevice = entertainmentDevice;
    }


    void button_five() {
        entertainmentDevice.button_five();
    }

    void button_six() {
        entertainmentDevice.button_six();
    }

    void device_feedback() {
        entertainmentDevice.device_feedback();
    }

    abstract void button_nine();


}
