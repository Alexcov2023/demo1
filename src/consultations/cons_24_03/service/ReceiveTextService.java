package consultations.cons_24_03.service;

import consultations.cons_24_03.entity.TextData;
import consultations.cons_24_03.service.util.ReadText;

public class ReceiveTextService {

    private final TextData textData;

    private ReadText readText = new ReadText();

    public ReceiveTextService(TextData textData) {
        this.textData = textData;
    }

    public void  receive(){
        String workingText = readText.inputText();
        textData.setText(workingText);
    }
    public void splitText(){
        String[] srtings = textData.getText().trim().split("");
    }
}
