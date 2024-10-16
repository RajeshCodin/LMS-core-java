import java.util.*;

public class Library {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added Succefully");
    }

    public void removeBook(int bookID) {
        Book bookToRemove = findBookByID(bookID);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("Book removeed Succefuuly !");
        } else {
            System.out.println("Book not found;");
        }
    }

    public Book findBookByID(int bookID) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                return book;
            }
        }
        return null;
    }

    public void displayAvailableBooks() {
        if (books.isEmpty()) {
            System.out.println("No book is avaiavle");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public Book searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }
}
