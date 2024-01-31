package consultations.cons_24_02;

import java.util.Scanner;

public class Services {

    public String inputMessage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текстовое сообщение для кодировки");
        scanner.nextLine();
        return inputMessage();
    }

    public char [] splitMessageForSymbols(String textMessage) {
        char[] charsTextMessage  = textMessage.toCharArray();
        return charsTextMessage;
    }

    public char[] codingSymbols(char[] charsTextMessage){
        for (int i = 0; i < charsTextMessage.length; i++) {
            //char[] charCodingSymbols =
            //charsTextMessage[i] =
        }
        return charsTextMessage;
    }



}
