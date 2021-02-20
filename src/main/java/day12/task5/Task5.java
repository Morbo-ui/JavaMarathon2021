package day12.task5;

import java.util.List;
import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Gruppa", 1990));
        members1.add(new MusicArtist("gdfs", 3934));
        members1.add(new MusicArtist("hfsgh", 432));
        members1.add(new MusicArtist("ncvbncvb", 4234));
        members1.add(new MusicArtist("ncv", 4233));

        MusicBand band1 = new MusicBand("Led Zeppelin", 1980, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("FLDL fsdaf", 55));
        members2.add(new MusicArtist("F42342rfsdf", 1000));
        members2.add(new MusicArtist("Fdfhgfhjgfnbf", 1000));
        members2.add(new MusicArtist("cnvb", 1000));
        members2.add(new MusicArtist("oil", 1000));
        MusicBand band2 = new MusicBand("The Beatles", 1999, members2);
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();


    }
}
