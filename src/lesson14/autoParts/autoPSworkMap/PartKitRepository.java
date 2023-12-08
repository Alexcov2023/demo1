package lesson14.autoParts.autoPSworkMap;

import java.util.Arrays;

public class PartKitRepository {

    PartsKit [] partKitDeposit = new PartsKit[3];

    public PartKitRepository (PartsKit partsKit1, PartsKit partsKit2, PartsKit partsKit3) {
        partKitDeposit [0] = partsKit1;
        partKitDeposit [1] = partsKit2;
        partKitDeposit [2] = partsKit3;

    }

    public PartsKit[] getPartKitDeposit() {
        return partKitDeposit;
    }

    public void setPartKitDeposit(PartsKit[] partKitDeposit) {
        this.partKitDeposit = partKitDeposit;
    }

    @Override
    public String toString() {
        return "PartKitRepository{" +
                "partKitDeposit=" + Arrays.toString(partKitDeposit) +
                '}';
    }
}
