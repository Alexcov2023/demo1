package lesson16.phone3version.phoneServices;

import lesson16.phone3version.phoneEntity.Cover;
import lesson16.phone3version.phoneEntity.Phone;

public class PhoneCoverService {
    /*
    6. Надеть чехол
    7. Снять чехол
     */
    public boolean putCover (Phone phone, Cover cover) {
        if (phone.getCover() == null) {
            phone.setCover(cover);
            return true;
        } else {
            return false;
        }
    }

    public Cover removeCover(Phone phone) {
        Cover removedCover = phone.getCover();
        phone.setCover(null);
        return removedCover;
    }

}
