package lesson14.autoParts.autoPSworkMap;

import java.util.Arrays;

public class PartRepository {

    private Part[] parts;

    public PartRepository() {
        parts = new Part[6];
        parts[0] = new Part(1, "motor", "Renault R4", 2000);
        parts[1] = new Part(2, "clutch", "Valeo C6", 350);
        parts[2] = new Part(3, "tire", "Matador S-5", 125);
        parts[3] = new Part(4, "car wheel", "Nippon R15", 190);
        parts[4] = new Part(5, "brake disc", "TRW D17", 240);
        parts[5] = new Part(6, "brake pads", "TRW BP17", 93);
    }


    public Part[] getParts() {
        return parts;
    }

    @Override
    public String toString() {
        return "PartRepository{" +
                "parts=" + Arrays.toString(parts) +
                '}';
    }
}
