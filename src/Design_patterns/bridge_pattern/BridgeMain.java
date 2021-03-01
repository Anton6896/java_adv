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

        RemoteButton dvd1 = new DVDRemoteButton(new DVDdevice(1, 5));
        System.out.println("\ndvd devise:");
        dvd1.button_five();
        dvd1.button_six();
        dvd1.button_six();
//        dvd1.button_six();
        dvd1.device_feedback();
        dvd1.button_nine();




    }
}
