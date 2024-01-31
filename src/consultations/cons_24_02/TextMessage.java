package consultations.cons_24_02;

public class TextMessage {

    private String textMessage;

    public TextMessage(String textMessage) {
        this.textMessage = textMessage;
    }

    public String getTextMessage() {
        return textMessage;
    }

    @Override
    public String toString() {
        return "TextMessage{" +
                "textMessage='" + textMessage + '\'' +
                '}';
    }
}
