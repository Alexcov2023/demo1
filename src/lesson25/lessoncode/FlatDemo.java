package lesson25.lessoncode;

import java.util.Set;
import java.util.TreeSet;

public class FlatDemo {
    public static void main(String[] args) {

        Set<Flat> flats = new TreeSet<>();

        flats.add(new Flat(3, 75));
        flats.add(new Flat(2, 62));
        flats.add(new Flat(4, 110));
        flats.add(new Flat(3, 82));

        System.out.println(flats);

    }
}
