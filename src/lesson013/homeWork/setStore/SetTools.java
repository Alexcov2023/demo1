package lesson013.homeWork.setStore;

import java.util.Scanner;

public class SetTools {
    String[] tools = new String[2];

    public String[] setTools(String[] tools) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1-й инструмент");
        tools [0] = scanner.nextLine();

        Scanner scanner1 = new Scanner(System.in);
        if (scanner.hasNext()) {
            System.out.println("Введите 2-й инструмент");
        }
        tools [1] = scanner.nextLine();
        return tools;
    }
/*
    public SetTools(String[] tools) {
     this.tools = tools;
    }

   /* @Override
    public String toString() {
        return "SetTools{" +
                "tools=" + Arrays.toString(tools) +
                '}';
    }

    */
}
