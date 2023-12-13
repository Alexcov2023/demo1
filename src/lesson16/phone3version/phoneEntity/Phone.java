package lesson16.phone3version.phoneEntity;

public class Phone {
    private int imei;

    private SimCard simCard;
    private SimCard simCardTwo;
    private String model;
    private Cover cover;

    public Phone(int imei, String model) {
        this.imei = imei;
        this.model = model;
    }

    public int getImei() {
        return imei;
    }

    public SimCard getSimCard() {
        return simCard;
    }

    public void setSimCard(SimCard simCard) {
        this.simCard = simCard;
    }

    public String getModel() {
        return model;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public SimCard getSimCardTwo() {
        return simCardTwo;
    }

    public void setSimCardTwo(SimCard simCardTwo) {
        this.simCardTwo = simCardTwo;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "imei=" + imei +
                ", simCard=" + simCard +
                ", simCardTwo=" + simCardTwo +
                ", model='" + model + '\'' +
                ", cover=" + cover +
                '}';
    }
}
