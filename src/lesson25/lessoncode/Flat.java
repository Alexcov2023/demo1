package lesson25.lessoncode;

public class Flat implements Comparable<Flat> {

    int numberOfBedrooms;

    int apartmentArea;


    public Flat(int numberOfBedrooms, int apartmentArea) {
        this.numberOfBedrooms = numberOfBedrooms;
        this.apartmentArea = apartmentArea;
    }

    @Override
    public String toString() {
        return "Flat{" +
                "numberOfBedrooms=" + numberOfBedrooms +
                ", apartmentArea=" + apartmentArea +
                '}';
    }

    @Override
    public int compareTo(Flat o) {
        int compareResult = numberOfBedrooms - o.numberOfBedrooms;

        if (compareResult == 0) {
            compareResult = apartmentArea - o.apartmentArea;
        }
        return compareResult;
    }
}
