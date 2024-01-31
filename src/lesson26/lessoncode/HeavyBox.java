package lesson26.lessoncode;

public class HeavyBox implements Comparable<HeavyBox>{
    private int length;
    private int height;
    private int weight;

    public HeavyBox(int length, int height, int weight) {
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "length=" + length +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }


    @Override
    public int compareTo(HeavyBox heavyBox) {
        int compareResult =  weight - heavyBox.getWeight();
        int volume = length * length * height;

        if (compareResult == 0 ) {
            compareResult = volume - (heavyBox.getLength() * heavyBox.getLength() * heavyBox.getHeight());
        }

        return compareResult;
    }
}
