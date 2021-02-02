package Design_patterns.bridge_pattern;

public class BridgeMain {
    public static void main(String[] args) {

        RemoteButton tv1 = new TvRemoteMute(new TVDevice(1, 200));
        RemoteButton tv2 = new TVRemotePause(new TVDevice(1, 200));


        System.out.println("Test tv mute :");
        tv1.button_five();
        tv1.button_six();
        tv1.button_nine();


        System.out.println("\ntv with pause :");
        tv2.button_five();
        tv2.button_six();
        tv2.button_nine();
        tv2.device_feedback();

    }
}
