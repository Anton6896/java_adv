package Design_patterns.bridge_pattern;

public class TVRemotePause extends RemoteButton {

    public TVRemotePause(EntertainmentDevice devise) {
        super(devise);
    }

    @Override
    void button_nine() {
        System.out.println("[ TVRemotePause ] -- tv was paused");
    }
}
