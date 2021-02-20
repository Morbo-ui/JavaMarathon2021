package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Gruppa");
        members1.add("khjkhg");
        members1.add("fdsaf");
        members1.add("G3es");
        members1.add("fkl;djas");

        MusicBand band1 = new MusicBand("Led Zeppelin",1980,members1);

        List<String> members2 = new ArrayList<>();
        members2.add("FLDL fsdaf");
        members2.add("ip[o P{OIP{O");
        members2.add("WQE rew");
        members2.add("UOI M<>");
        members2.add("CZXOIPJ OPASK");

        MusicBand band2 = new MusicBand("The Beatles",1999,members2);
        band1.printMembers();
        band2.printMembers();
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}
