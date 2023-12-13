package lesson16.phone3version.phoneServices;

import lesson16.phone3version.phoneEntity.Phone;
import lesson16.phone3version.phoneEntity.SimCard;

public class PhoneSimCardService {
    /*
     1. Вставить симку
    2. удалить симку
    3. Заменить симку с сохранением номера
     */
    public boolean insertSimCard(Phone phone, SimCard simCard){
        if (simCard.getNumber() != 0) {
            phone.setSimCard(simCard);
            return true;
        } else {
            return false;
        }
    }

    public SimCard removeSimCard(Phone phone) {
        SimCard removedSimCard = phone.getSimCard();
        phone.setSimCard(null);
        return removedSimCard;
    }

    public SimCard changeSimCard(Phone phone, SimCard newSimCard){
        SimCard removedSimCard = phone.getSimCard();
        int oldNumber = removedSimCard.getNumber();
        newSimCard.setNumber(oldNumber);
        phone.setSimCard(newSimCard);
        removedSimCard.setNumber(0);
        return removedSimCard;

    }
    public boolean insertSimCardTwo(Phone phone, SimCard simCard){
        if (simCard.getNumber() != 0) {
            phone.setSimCardTwo(simCard);
            return true;
        } else {
            return false;
        }
    }



}
