package lesson16.phone.phoneEntity;

public class Cover {
    private String colour;
    private String material;

    public Cover(String colour, String material) {
        this.colour = colour;
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "colour='" + colour + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
