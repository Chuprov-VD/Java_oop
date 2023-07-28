package Task3;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> catalog;

    public Library() {
        catalog = new ArrayList<>();
    }

    public void addBook(Book book) {
        catalog.add(book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
    }

    public void displayAvailableBooks() {
        System.out.println("Доступные книги:");
        for(Book book : catalog) {
            if (book.getAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void searchByAuthor(String author) {
        System.out.printf("Книги автора: %s \n", author);
        for(Book book : catalog) {
            if (book.getAuthor().equals(author)) {
                book.displayInfo();
            }
        }
    }

}
