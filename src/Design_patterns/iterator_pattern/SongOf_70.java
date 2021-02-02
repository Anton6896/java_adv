package Design_patterns.iterator_pattern;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongOf_70 implements SongIterator {

    List<SongInfo> bestSong;

    public SongOf_70() {
        bestSong = new ArrayList<>();
        // init with build in song
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);
    }

    void addSong(String songName, String songBand, int songYear) {
        SongInfo songInfo = new SongInfo(songName, songBand, songYear);
        bestSong.add(songInfo);
    }

    List<SongInfo> getBestSong() {
        return bestSong;
    }


    @Override
    public Iterator createIterator() {
        return bestSong.iterator();
    }
}
