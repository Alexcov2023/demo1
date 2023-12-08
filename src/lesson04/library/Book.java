package lesson04.library;


public class Book {
    String autor;
    String bookTitle;
    int numberOfPages;
    String catalogNumber;
    boolean readerPossession;

    public Book(String autor, String bookTitle, int numberOfPages, String catalogNumber, boolean readerPossession) {
        this.autor = autor;
        this.bookTitle = bookTitle;
        this.numberOfPages = numberOfPages;
        this.catalogNumber = catalogNumber;
        this.readerPossession = readerPossession;
    }

    public Book(String autor, String bookTitle) {
        this.autor = autor;
        this.bookTitle = bookTitle;
    }

    @Override
    public String toString() {
        return "Book{" +
                "autor='" + autor + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", catalogNumber='" + catalogNumber + '\'' +
                ", readerPossession=" + readerPossession +
                '}';
    }

}