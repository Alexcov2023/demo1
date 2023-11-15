package lesson4.library;

public class BookDemo {
    public static void main(String[] args) {

        Book book1 = new Book("Достоевский Ф. М.", "Идиот", 640, 251, true);

        System.out.println("Автор: " + book1.autor + "," + " Название книги: " + book1.bookTitle + "," + " Количество страниц: " + "640" +
                "," + " Номер в каталоге: " + "251" + "," + " Книга находится у читателя: " + "истина");

        System.out.println("---------------------------------------------------------------------");

        System.out.println("Автор: " + book1.autor + "," + " Название книги: " + book1.bookTitle + "," + " Количество страниц: " + book1.numberOfPages +
        "," + " Номер в каталоге: " + book1.catalogNumber + "," + " Книга находится у читателя: " + book1.readerPossession);


        System.out.println("===================================================================================================================================");



        Book book2 = new Book("Толстой Л. Н.", "Война и мир", 1300, 19, false);

        book2.metod1();

        System.out.println("---------------------------------------------------------------------");

        book2.metod2();

    }
}

