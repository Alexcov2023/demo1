package lesson19.lessonCode;

public class WhatsApp implements Messenger {
    @Override
    public void reciveMesage() {
        System.out.println("Сообщение Ватсапп получено");

    }

    @Override
    public void sendMessage() {
        System.out.println("Сообщение Ватсапп отправлено");

    }
}
