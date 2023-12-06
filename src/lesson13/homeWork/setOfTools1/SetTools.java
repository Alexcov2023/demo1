package lesson13.homeWork.setOfTools1;

import java.util.Scanner;

public class SetTools {
    String tool1;
    String tool2;


    public SetTools(String tool1, String tool2) {
        this.tool1 = tool1;
        this.tool2 = tool2;
    }

    @Override
    public String toString() {
        return "Состав: "
                 + tool1 + ", "
                 + tool2;
    }



}
