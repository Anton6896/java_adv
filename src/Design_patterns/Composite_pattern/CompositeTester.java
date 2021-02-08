package Design_patterns.Composite_pattern;

public class CompositeTester {
    public static void main(String[] args) {

        SongComponent industrialMusic = new SongGroup(
                "Industrial",
                "is a style of experimental music that draws on transgressive " +
                        "and provocative themes"
        );

        SongComponent heavyMetalMusic = new SongGroup(
                "Industrial",
                "\nHeavy Metalis a genre of rock that developed " +
                        "in the late 1960s, largely in the UK and in the US"
        );

        SongComponent dubstepMusic = new SongGroup(
                "\nDubstep",
                "is a genre of electronic dance music that originated in South London, England"
        );


        // top level
        SongComponent allSongGroup = new SongGroup("SongList", "every songs that available");

        allSongGroup.add(industrialMusic);
        industrialMusic.add(new Song("Head Like a Hole", "NIN", 1990));
        industrialMusic.add(new Song("Headhunter", "Front 242", 1988));

        industrialMusic.add(dubstepMusic);

        heavyMetalMusic.add(new Song("War Pigs", "Black Sabath", 1970));
        heavyMetalMusic.add(new Song("Ace of Spades", "Motorhead", 1980));

        Dj crazzylarry = new Dj(allSongGroup);
        crazzylarry.display();

    }
}
