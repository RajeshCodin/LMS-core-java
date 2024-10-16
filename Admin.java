public class Admin {
    private Library library;

    public Admin(Library library) {
        this.library = library;
    }

    public void addBook(int bookID, String title, String author, int quantity) {
        Book book = new Book(bookID, title, author, quantity);
        library.addBook(book);
    }

    public void removeBook(int bookID) {
        library.removeBook(bookID);
    }

    public void viewAllBooks() {
        library.displayAvailableBooks();
    }

}
