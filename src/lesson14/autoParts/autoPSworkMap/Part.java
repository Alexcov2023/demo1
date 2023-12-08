package lesson14.autoParts.autoPSworkMap;

public class Part {
    private int id;
    private String partName;
    private String partMark;
    private double partPrice;


    public Part(int id, String partName, String partMark, double partPrice) {
        this.id = id;
        this.partName = partName;
        this.partMark = partMark;
        this.partPrice = partPrice;
    }

    public int getId() {
        return id;
    }

    public String getPartName() {
        return partName;
    }

    public String getPartMark() {
        return partMark;
    }

    public double getPartPrice() {
        return partPrice;
    }

    @Override
    public String toString() {
        return "Part{" +
                "id=" + id +
                ", partName='" + partName + '\'' +
                ", partMark='" + partMark + '\'' +
                ", partPrice=" + partPrice +
                '}';
    }
}
