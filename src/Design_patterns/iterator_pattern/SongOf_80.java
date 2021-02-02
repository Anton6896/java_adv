package Design_patterns.iterator_pattern;

import java.util.Hashtable;
import java.util.Iterator;

public class SongOf_80 implements SongIterator {

    Hashtable<Integer, SongInfo> bestSongs;
    private int hashKey = 0;

    public SongOf_80() {
        bestSongs = new Hashtable<>();

        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
    }

    void addSong(String songName, String songBand, int songYear) {
        SongInfo songInfo = new SongInfo(songName, songBand, songYear);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
