package lesson4.library;
/*
Написать программу, которая:
        - оперирует объектами книга со следующими параметрами
        - автор
        - название книги
        - количество страниц
        - номер в каталоге
        - параметр который показывает книга в хранилище или на руках

        Нужно уметь создавать новые книги двумя способами:
        - либо указывать только автора и название книги
        в этом случае недостающе при создании книги данные добавляются отдельно
        - либо полностью все параметры

        Написать отдельные сервисные методы которые:
        - создают новую книгу только с автором и названием
        - создают новую книгу с использованием всех параметров
        - редактирует книгу добавляя: номер каталога, количество страниц и где книга находится
        - который вывод подробно информацию о книге

 */
public class Book {
    String autor;
    String bookTitle;
    int numberOfPages;
    int catalogNumber;
    boolean readerPossession;

    public Book(String autor, String bookTitle, int numberOfPages, int catalogNumber, boolean readerPossession) {
        this.autor = autor;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        this.catalogNumber = catalogNumber;
        this.readerPossession = readerPossession;
    }

        public void metod1(){
        System.out.println("Автор: " + autor + "," + " Название книги: " + bookTitle);

    }

    public void metod2(){
        System.out.println("Автор: " + autor + "," + " Название книги: " + bookTitle + "," + " Количество страниц: " + numberOfPages +
                "," + " Номер в каталоге: " + catalogNumber + "," + " Книга находится у читателя: " + readerPossession);

    }

}


