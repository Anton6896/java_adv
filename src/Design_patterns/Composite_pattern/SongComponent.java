package Design_patterns.Composite_pattern;

public abstract class SongComponent {
    void add(SongComponent newComponent) {
        throw new UnsupportedOperationException();
    }

    void remove(SongComponent newComponent) {
        throw new UnsupportedOperationException();
    }

    String getSong() {
        throw new UnsupportedOperationException();
    }

    String getBandName() {
        throw new UnsupportedOperationException();
    }

    int getReleaseDate() {
        throw new UnsupportedOperationException();
    }

    void display() {
        throw new UnsupportedOperationException();
    }
}
