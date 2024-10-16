import java.util.*;

public class Student {
    private int studentId;
    private String name;

    private List<Book> borrowedBooks = new ArrayList<>();

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.getQuantity() > 0) {
            borrowedBooks.add(book);
            book.setQuantity(book.getQuantity() - 1);
            System.out.println("Book borrowed Successfully !");
        } else {
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setQuantity(book.getQuantity() + 1);
            System.out.println("Book return Succefully !");
        } else {
            System.out.println("You don't have this book");
        }
    }

    public void viewBorrowedBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println("You have not borrowed any books");
        } else {
            for (Book book : borrowedBooks) {
                System.out.println(book);
            }
        }
    }
}
