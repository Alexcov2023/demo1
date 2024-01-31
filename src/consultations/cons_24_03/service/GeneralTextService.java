package consultations.cons_24_03.service;

import consultations.cons_24_03.entity.TextData;
import consultations.cons_24_03.service.util.ReadText;

public class GeneralTextService {

    private final TextData textData;

    private ReadText readText = new ReadText();

    public GeneralTextService(TextData textData) {
        this.textData = textData;
    }
    public void splitText(){
        String[] strings = textData.getText().trim().split(" ");
    }
}
