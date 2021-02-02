package Design_patterns.bridge_pattern;

public class TvRemoteMute extends RemoteButton {

    public TvRemoteMute(EntertainmentDevice new_device) {
        super(new_device);
    }

    @Override
    void button_nine() {
        System.out.println(" [ TvRemoteMute ] -- tv was muted  ");
    }
}
