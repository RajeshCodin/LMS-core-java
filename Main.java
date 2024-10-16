import java.util.Scanner;

public class Main {

    public static void adminMenu(Admin admin, Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Menu :");
            System.out.println("1.Add Books");
            System.out.println("2.Remove Books");
            System.out.println("3.View All Books");
            System.out.println("4. Back to Menu");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter Book ID: ");
                int bookID = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter Book title: ");
                scanner.nextLine();
                System.out.println("Enter Author: ");
                String author = scanner.nextLine();
                System.out.println("Enter Quantity :");
                int quantity = scanner.nextInt();

                admin.addBook(bookID, author, author, quantity);
            } else if (choice == 2) {
                System.out.println("Enter Book ID to remove: ");
                int bookID = scanner.nextInt();
                admin.removeBook(bookID);
            } else if (choice == 3) {
                admin.viewAllBooks();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }

    public static void studentMenu(Library library, Scanner scanner) {
        Student student = new Student(1, "Rajesh");
        while (true) {
            System.out.println("\nStudent Menu");
            System.out.println("1.Search Books");
            System.out.println("2.Borrow Book");
            System.out.println("3.Return Book");
            System.out.println("4.View Borrowed Books");
            System.out.println("5.Back to Menu");
            System.out.println("Enter your choice");
            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine();
                System.out.println("Enter your book title");
                String title = scanner.nextLine();
                Book book = library.searchBook(title);
                if (book != null) {
                    System.out.println(book);
                } else {
                    System.out.println("Book not found");
                }
            }

            else if (choice == 2) {
                scanner.nextLine();
                System.out.println("Enter your Book ID :");
                int bookID = scanner.nextInt();
                Book book = library.findBookByID(bookID);
                if (book != null) {
                    student.borrowBook(book);
                    System.out.println(book);
                } else {
                    System.out.println("Book not found");
                }
            }

            else if (choice == 3) {
                scanner.nextLine();
                System.out.println("Enter Book ID");
                int bookID = scanner.nextInt();
                Book book = library.findBookByID(bookID);
                if (book != null) {
                    student.returnBook(book);
                    System.out.println(book);
                } else {
                    System.out.println("Book not found");
                }
            } else if (choice == 4) {
                student.viewBorrowedBooks();

            }

            else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Admin admin = new Admin(library);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Librry Management System");
            System.out.println("1.Admin Login");
            System.out.println("2.Student Login");
            System.out.println("3.Exit ");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                adminMenu(admin, scanner);
            } else if (choice == 2) {
                studentMenu(library, scanner);
            }

        }

    }
}
