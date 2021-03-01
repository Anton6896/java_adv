package Design_patterns.bridge_pattern;

public class DVDRemoteButton extends RemoteButton{

    public DVDRemoteButton(EntertainmentDevice entertainmentDevice) {
        super(entertainmentDevice);
    }

    @Override
    void button_nine() {
        System.out.println("dvd -> save this chapter for dvd");
    }
}
