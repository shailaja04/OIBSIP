import java.util.ArrayList;
import java.util.Scanner;
class Book {
    int id;
    String title;
    String author;
    boolean isIssued;
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }
    void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author + ", Issued: " + (isIssued ? "Yes" : "No"));
    }
}
public class LibraryManagementSystem {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static String adminUsername = "admin";
    static String adminPassword = "admin@123"; 
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Admin Login");
            System.out.println("2. User Access");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = getIntInput();
            switch (choice) {
                case 1 :
                 adminLogin();
                case 2 :
                 userAccess();
                case 3 :
                 System.out.println("Exiting system. Goodbye!");
                default :
                 System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
    static int getIntInput() {
        while (true) {
            String input = sc.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
    }
    static void adminLogin() {
        System.out.print("Enter admin username: ");
        String user = sc.nextLine();
        System.out.print("Enter admin password: ");
        String pass = sc.nextLine();
        if (user.equals(adminUsername) && pass.equals(adminPassword)) {
            adminMenu();
        } else {
            System.out.println("Invalid credentials!");
        }
    }
    static void adminMenu() {
        int choice;
        do {
            System.out.println("\nAdmin Menu ");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. View All Books");
            System.out.println("5. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = getIntInput();
            switch (choice) {
                case 1 :
                 addBook();
                 break;
                case 2 :
                updateBook();
                break;
                case 3 :
                 deleteBook();
                 break;
                case 4 :
                 viewBooks();
                 break;
                case 5 :
                 System.out.println("Returning to main menu...");
                 break;
                default :
                 System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
    static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = getIntInput();
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();
        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }
    static void updateBook() {
        System.out.print("Enter Book ID to update: ");
        int id = getIntInput();
        for (Book b : books) {
            if (b.id == id) {
                System.out.print("Enter new Title: ");
                b.title = sc.nextLine();
                System.out.print("Enter new Author: ");
                b.author = sc.nextLine();
                System.out.println("Book updated successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    static void deleteBook() {
        System.out.print("Enter Book ID to delete: ");
        int id = getIntInput();
        for (Book b : books) {
            if (b.id == id) {
                books.remove(b);
                System.out.println("Book deleted successfully!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("\n All Books");
            for (Book b : books) {
                b.display();
            }
        }
    }
    static void userAccess() {
        int choice;
        do {
            System.out.println("\nUser Menu");
            System.out.println("1. View All Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = getIntInput();

            switch (choice) {
                case 1 :
                 viewBooks();
                 break;
                case 2 :
                 issueBookLoop();
                 break;
                case 3 :
                 returnBookLoop();
                 break;
                case 4 :
                 System.out.println("Returning to main menu...");
                 break;
                default :
                 System.out.println("Invalid choice.");
                 break;
            }
        } while (choice != 4);
    }
    static void issueBookLoop() {
        while (true) {
            System.out.print("Enter Book ID to issue (0 to go back): ");
            int id = getIntInput();
            if (id == 0)
             break;
            boolean found = false;
            for (Book b : books) {
                if (b.id == id) {
                    found = true;
                    if (!b.isIssued) {
                        b.isIssued = true;
                        System.out.println("Book issued successfully!");
                    } else {
                        System.out.println("Book is already issued.");
                    }
                    break;
                }
            }
            if (!found) System.out.println("Book not found!");
        }
    }
    static void returnBookLoop() {
        while (true) {
            System.out.print("Enter Book ID to return (0 to go back): ");
            int id = getIntInput();
            if (id == 0) 
            break;
            boolean found = false;
            for (Book b : books) {
                if (b.id == id) {
                    found = true;
                    if (b.isIssued) {
                        b.isIssued = false;
                        System.out.println("Book returned successfully!");
                    } else {
                        System.out.println("Book was not issued.");
                    }
                    break;
                }
            }
            if (!found) System.out.println("Book not found!");
        }
    }
}
