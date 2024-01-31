package lesson27.libraryVar2;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books = new ArrayList<>();
    AuthorRepository authorRepository = new AuthorRepository();
    GenreRepository genreRepository = new GenreRepository();

     public void addBook(Book book) {
        books.add(book);
        authorRepository.addAuthor(book);
        genreRepository.addBookToGenre(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public void removeBook(Book book){
        books.remove(book);
        authorRepository.removeBook(book);
        genreRepository.removeBookFromGenre(book);
    }

    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                '}';
    }

}
