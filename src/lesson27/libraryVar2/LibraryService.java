package lesson27.libraryVar2;

public class LibraryService {
    public static void main(String[] args) {

        //addBook
        BookRepository bookRepository = new BookRepository();

        Book book1 = new Book("Title1", "Author1", "Genre1");
        Book book2 = new Book("Title2", "Author2", "Genre2");
        Book book3 = new Book("Title3", "Author3", "Genre3");
        Book book4 = new Book("Title4", "Author1", "Genre2");

        bookRepository.addBook(book1);
        bookRepository.addBook(book2);
        bookRepository.addBook(book3);
        bookRepository.addBook(book4);
        System.out.println(bookRepository);
        System.out.println("============================================================");

        //getBooksByAuthor
        System.out.println(bookRepository.authorRepository);
        System.out.println("Books by Author1 " + bookRepository.authorRepository.getBooksByAuthor("Author1"));
        System.out.println("Books by Author3 " + bookRepository.authorRepository.getBooksByAuthor("Author3"));
        System.out.println("============================================================");

        //getBooksByGenre
        System.out.println(bookRepository.genreRepository);
        System.out.println("Books by Genre2 " + bookRepository.genreRepository.getBooksByGenre("Genre2"));
        System.out.println("Books by Genre1 " + bookRepository.genreRepository.getBooksByGenre("Genre1"));
        System.out.println("============================================================");

        //removeBook
        System.out.println("Book to delete --> " + book2);
        bookRepository.removeBook(book2);
        System.out.println(bookRepository);
        System.out.println(bookRepository.authorRepository);
        System.out.println(bookRepository.genreRepository);
        System.out.println("---------------------------------");

        System.out.println("Book to delete --> " + book4);
        bookRepository.removeBook(book4);
        System.out.println(bookRepository);
        System.out.println(bookRepository.authorRepository);
        System.out.println(bookRepository.genreRepository);

    }
}
