package lesson16.phone;

import lesson16.phone.phoneEntity.Cover;
import lesson16.phone.phoneEntity.Phone;
import lesson16.phone.phoneEntity.SimCard;
import lesson16.phone.phoneServices.PhoneCoverService;
import lesson16.phone.phoneServices.PhoneSimCardService;
import lesson16.phone.phoneServices.PhoneSmsService;

import java.util.Arrays;

public class PhoneDemo {
    public static void main(String[] args) {

                Phone phone = new Phone(112233, "Samsung");
                SimCard simCard1 = new SimCard(55667788);
                SimCard simCard2 = new SimCard(99110022);
                Cover cover1 = new Cover("коричневый", "кожа");
                Cover cover2 = new Cover("розовый", "пластик");

                PhoneSimCardService phoneSimCardService = new PhoneSimCardService();
                PhoneSmsService phoneSmsService = new PhoneSmsService();
                PhoneCoverService phoneCoverService = new PhoneCoverService();

                // Проверка вставки сим карты
                System.out.println(phone); // телефон до установки сим-карты
                boolean inserted = phoneSimCardService.insertSimCard(phone, simCard1);
                if (inserted) {
                    System.out.println("Sim карта вставлена: " + phone);
                } else {
                    System.out.println("Ошибка вставки Sim карты.");
                }
               System.out.println("--------------------------------------------------------------------------------------------");

                //Проверка одет ли чехол
                //phoneCoverService.putCover(phone, cover1);
                boolean coverOff = phoneCoverService.putCover(phone, cover1);
                if (coverOff) {
                    System.out.println("Чехол надет: " + phone);
                } else {
                    System.out.println("На телефоне уже установлен чехол. Для установки нового чехла снимите установленный чехол");
                }

                boolean coverOff1 = phoneCoverService.putCover(phone, cover2);
                if (coverOff1) {
                System.out.println("Чехол надет: " + phone);
                } else {
                System.out.println("На телефоне уже установлен чехол. Для установки нового чехла снимите установленный чехол.");
                }
                System.out.println("-------------------------------------------------------------------------------------------");


                // Проверка получения смс
                phoneSmsService.receivedSms(phone, "Привет!");
                phoneSmsService.receivedSms(phone, "Как дела?");
                System.out.println("Полученные смс: " + Arrays.toString(phone.getSimCard().getSms()));
                System.out.println("-------------------------------------------------------------------------------------------");


                // Проверка удаления смс
                phoneSmsService.deleteSmsMessage(phone, 1);
                System.out.println("Смс после удаления: " + Arrays.toString(phone.getSimCard().getSms()));
                System.out.println("------------------------------------------------------------------------------------------");

                // Проверка удаления всех смс
                phoneSmsService.deleteAllMessages(phone);
                System.out.println("Смс после удаления всех: " + Arrays.toString(phone.getSimCard().getSms()));
                System.out.println("------------------------------------------------------------------------------------------");

               // Проверка получения всех смс
                phoneSmsService.receivedSms(phone, "Message1");
                phoneSmsService.receivedSms(phone, "Message2");
                phoneSmsService.receivedSms(phone, "Message3");
                phoneSmsService.receivedSms(phone, "Message4");
                phoneSmsService.receivedSms(phone, "Message5");
                phoneSmsService.receivedSms(phone, "Message6");
                phoneSmsService.receivedSms(phone, "Message7");
                phoneSmsService.receivedSms(phone, "Message8");
                phoneSmsService.receivedSms(phone, "Message9");
                phoneSmsService.receivedSms(phone, "Message10");
                System.out.println("Смс после удаления всех: " + Arrays.toString(phone.getSimCard().getSms()));

                phoneSmsService.receivedSms(phone, "Message11");
                System.out.println("=======================================");
                System.out.println(phone);
                System.out.println("------------------------------------------------------------------------------------------");


                // Проверка замены сим карты
                SimCard removedSim = phoneSimCardService.changeSimCard(phone, simCard2);
                System.out.println("Старая сим карта: " + removedSim);
                System.out.println("Новая сим карта: " + phone.getSimCard());

                System.out.println("=======================================");
                System.out.println(phone);

                // Проверка удаления сим карты
                SimCard removed = phoneSimCardService.removeSimCard(phone);
                System.out.println("Удаленная сим карта " + removed);
                System.out.println(" Телефон после удаления сим карты: " + phone);

                //проверка снятия чехла
                Cover removedCover = phoneCoverService.removeCover(phone);
                System.out.println("Снятый чехол " + removedCover);
                System.out.println("Телефон после снятия чехла " + phone);




    }
}
