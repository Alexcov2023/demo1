package lesson04.library;

public class BookDemo {
    /*
    Задача 1.
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
    public static void main (String[] args) {
        Book book1 = new Book ("Дюма", "Три мушкетера", 350, "123-432-678", true);
        System.out.println(book1);


        Book book2 = new Book("Жюль Верн", "Дети капитана Гранта");
        System.out.println(book2);

        BookUtil util = new BookUtil();
        util.editCatalogNumber("956-832-487", book2);
        util.editnumberOfPages(280, book2);
        util.editreaderPossession(false, book2);

        System.out.println(book2);

        System.out.println("===========================================================");

        Book book4 = util.copyBook(book2);
        System.out.println(book4);

        // другой альтернативный способ копирования

        Book book5 = new Book(book1.autor + " (copy)", book1.bookTitle, book1.numberOfPages, book1.catalogNumber, book1.readerPossession);
        System.out.println(book5);


    }


}
