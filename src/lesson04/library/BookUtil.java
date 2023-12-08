package lesson04.library;

public class BookUtil {

    public void editCatalogNumber (String catalogNumber, Book book) {
        book.catalogNumber = catalogNumber;

    }

    public void editnumberOfPages (int numberOfPages, Book book) {
        book.numberOfPages  = numberOfPages;

    }

    public void editreaderPossession (boolean readerPossession, Book book) {
        book.readerPossession  = readerPossession;

    }

    public Book copyBook (Book book) {
        Book copyBook = new Book(book.autor, book.bookTitle + " (copy)", book.numberOfPages, book.catalogNumber, book.readerPossession);
        return copyBook;
    }


}
