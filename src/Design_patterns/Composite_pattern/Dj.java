package Design_patterns.Composite_pattern;

public class Dj {
    SongComponent songsList;

    public Dj(SongComponent songsList) {
        this.songsList = songsList;
    }

    void display() {
        songsList.display();
    }

}
