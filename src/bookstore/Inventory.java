import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Book> books;

    public Inventory() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

}