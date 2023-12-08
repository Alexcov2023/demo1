package lesson14.autoParts.autoPSworkMap;

import java.util.Arrays;

public class PartsKit {

    private Part [] partsKit = new Part [2];

    public PartsKit (Part part1, Part part2) {
        partsKit [0] = part1;
        partsKit [1] = part2;

    }

    public Part[] getPartsKit() {
        return partsKit;
    }

    @Override
    public String toString() {
        return "PartsKit{" +
                "partsKit=" + Arrays.toString(partsKit) +
                '}';
    }
}
