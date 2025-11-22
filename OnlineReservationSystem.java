import java.util.ArrayList;
import java.util.Scanner;
class Reservation {
    String name;
    int age;
    String trainNumber;
    String trainName;
    String classType;
    String dateOfJourney;
    String from;
    String to;
    String pnr;
    Reservation(String name, int age, String trainNumber, String trainName, String classType,
                String dateOfJourney, String from, String to, String pnr) {
        this.name = name;
        this.age = age;
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.classType = classType;
        this.dateOfJourney = dateOfJourney;
        this.from = from;
        this.to = to;
        this.pnr = pnr;
    }
    void display() {
        System.out.println("PNR: " + pnr);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Train No: " + trainNumber);
        System.out.println("Train Name: " + trainName);
        System.out.println("Class: " + classType);
        System.out.println("Date of Journey: " + dateOfJourney);
        System.out.println("From: " + from + " To: " + to);
        // System.out.println("");
    }
}
public class OnlineReservationSystem {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Reservation> reservations = new ArrayList<>();
    static String username = "admin";
    static String password = "admin@123";
    public static void main(String[] args) {
        if (login()) {
            int choice;
            do {
                System.out.println("\nOnline Reservation System ");
                System.out.println("1. Book Reservation");
                System.out.println("2. Cancel Reservation");
                System.out.println("3. View All Reservations");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1 :
                     bookReservation();
                     break;
                    case 2 : 
                      cancelReservation();
                      break;
                    case 3 : 
                      viewReservations();
                      break;
                    case 4 :
                     System.out.println("Exiting system. Goodbye!");
                     break;
                    default :
                     System.out.println("Invalid choice. Try again.");
                     break;
                }
            } while (choice != 4);
        } else {
            System.out.println("Invalid username or password. Exiting system.");
        }
    }
    static boolean login() {
        System.out.print("Enter username: ");
        String userInput = sc.nextLine();
        System.out.print("Enter password: ");
        String passInput = sc.nextLine();
        return userInput.equals(username) && passInput.equals(password);
    }
    static void bookReservation() {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Train Number: ");
        String trainNumber = sc.nextLine();
        System.out.print("Enter Train Name: ");
        String trainName = sc.nextLine();
        System.out.print("Enter Class Type: ");
        String classType = sc.nextLine();
        System.out.print("Enter Date of Journey (DD/MM/YYYY): ");
        String dateOfJourney = sc.nextLine();
        System.out.print("From: ");
        String from = sc.nextLine();
        System.out.print("To: ");
        String to = sc.nextLine();
        String pnr = "PNR" + (reservations.size() + 1);
        Reservation r = new Reservation(name, age, trainNumber, trainName, classType, dateOfJourney, from, to, pnr);
        reservations.add(r);
        System.out.println("Reservation Successful! Your PNR: " + pnr);
    }
    static void cancelReservation() {
        System.out.print("Enter PNR to cancel: ");
        String pnrInput = sc.nextLine();
        Reservation found = null;
        for (Reservation r : reservations) {
            if (r.pnr.equalsIgnoreCase(pnrInput)) {
                found = r;
                break;
            }
        }
        if (found != null) {
            found.display();
            System.out.print("Confirm cancellation? (yes/no): ");
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("yes")) {
                reservations.remove(found);
                System.out.println("Reservation cancelled successfully!");
            } else {
                System.out.println("Cancellation aborted.");
            }
        } else {
            System.out.println("PNR not found!");
        }
    }
    static void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            System.out.println("\nAll Reservations");
            for (Reservation r : reservations) {
                r.display();
            }
        }
    }
}
