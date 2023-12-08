package lesson14.autoParts;

import lesson14.autoParts.autoPSworkMap.PartKitRepository;
import lesson14.autoParts.autoPSworkMap.PartRepository;
import lesson14.autoParts.autoPSworkMap.PartsKit;

public class AutoPartsStore {

    public static void main(String[] args) {

        PartRepository repository = new PartRepository();
        for (int i = 0; i < repository.getParts().length; i++) {
            System.out.println(repository.getParts()[i]);
        }

        System.out.println("==============================================");



        PartsKit partsKits1 = new PartsKit (repository.getParts()[0], repository.getParts()[1]);
        PartsKit partsKits2 = new PartsKit (repository.getParts()[2], repository.getParts()[3]);
        PartsKit partsKits3 = new PartsKit (repository.getParts()[4], repository.getParts()[5]);

        System.out.println(partsKits1);
        System.out.println(partsKits2);
        System.out.println(partsKits3);
        System.out.println("==================================================");

        PartKitRepository partKitDeposit = new PartKitRepository(partsKits1, partsKits2, partsKits3);
        for (int i = 0; i < partKitDeposit.getPartKitDeposit().length; i++) {
            System.out.println(partKitDeposit.getPartKitDeposit()[i]);
        }












    }
}
