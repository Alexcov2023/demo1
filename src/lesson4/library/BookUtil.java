package lesson4.library;

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

}
