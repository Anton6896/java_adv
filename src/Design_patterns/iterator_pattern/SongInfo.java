package Design_patterns.iterator_pattern;

public class SongInfo {
    String songName;
    String bandName;
    int yearRelease;

    public SongInfo(String newSonngName, String newBandName, int newYearRelease) {
        songName = newSonngName;
        bandName = newBandName;
        yearRelease = newYearRelease;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearRelease() {
        return yearRelease;
    }
}
