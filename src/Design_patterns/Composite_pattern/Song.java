package Design_patterns.Composite_pattern;

public class Song extends SongComponent {
    String name;
    String bandName;
    int releaseYear;

    public Song(String _name, String _band, int _year) {
        name = _name;
        bandName = _band;
        releaseYear = _year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getBandName() {
        return bandName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    void display() {
        System.out.println(getName() + " was recorded by " +
                getBandName() + " in " + getReleaseYear());

    }
}
