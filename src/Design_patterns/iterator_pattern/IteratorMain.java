package Design_patterns.iterator_pattern;

public class IteratorMain {
    public static void main(String[] args) {
        SongOf_70 songOf_70 = new SongOf_70();
        SongOf_80 songOf_80 = new SongOf_80();

        DiscJokey mike = new DiscJokey(songOf_70, songOf_80);
        mike.showTheSongs();

    }
}
