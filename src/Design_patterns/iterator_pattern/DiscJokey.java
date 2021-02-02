package Design_patterns.iterator_pattern;

import java.util.Iterator;

public class DiscJokey {
    SongIterator iterator70;
    SongIterator iterator80;

    public DiscJokey(SongIterator iterator70_, SongIterator iterator80_) {
        iterator70 = iterator70_;
        iterator80 = iterator80_;
    }

    void showTheSongs() {
        System.out.println("show all songs :");

        Iterator song70 = iterator70.createIterator();
        Iterator song80 = iterator80.createIterator();

        System.out.println("70s songs : ");
        printTheSongs(song70);

        System.out.println("80s songs : ");
        printTheSongs(song80);
    }

    void printTheSongs(Iterator iterator) {
        while (iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();
            System.out.println(songInfo.getSongName() + " " + songInfo.getBandName() + " " + songInfo.getYearRelease());
        }
        System.out.println("\n -- ");
    }
}
