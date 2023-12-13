package lesson16.phone3version.phoneServices;

import lesson16.phone3version.phoneEntity.Phone;

public class PhoneSmsService {
    /*
    4. Получить смс
    5. удалить какую-то смску
    6. Удалить все смс

    8. Вторая Сим карта (т.е. в одном телефоне 2 сим карты)
     */

     public boolean receivedSms(Phone phone, String message){
        String[] ourSmsMessages = phone.getSimCard().getSms();
        int emptyCell = firstEmptyCell(ourSmsMessages);
        if (emptyCell == -1) {
            System.out.println("Нет памяти для новой смс. Удалите прошлые сообщения!");
            return false;
        } else {
            ourSmsMessages[emptyCell] = message;
            return true;
        }
    }

    private int firstEmptyCell(String[] messages){
        for (int i = 0; i < messages.length; i++) {
            if (messages[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public boolean deleteSmsMessage(Phone phone, int smsNumber){
        if (smsNumber >= 0 && smsNumber < 10) {
        phone.getSimCard().getSms()[smsNumber] = null;
        return true;
        } else {
            System.out.println("Нет сообщения с таким номером!");
            return false;
        }
    }

    public boolean deleteAllMessages(Phone phone) {
        String[] newSmsMessages = new String[10];
        phone.getSimCard().setSms(newSmsMessages);
        return true;
    }

    // Методы на сим карту во втором слоте


}
