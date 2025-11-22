import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc1 = new BankAccount("user1", "12345", 10000);
        BankAccount acc2 = new BankAccount("user2", "56789", 8000);
        BankAccount acc3 = new BankAccount("user3", "19876", 5000);
        BankAccount acc4 = new BankAccount("user4", "16543", 12000);
        BankAccount acc5 = new BankAccount("user5", "98345", 7000);
        System.out.println("WELCOME TO ATM SERVICE\n");
        System.out.print("Enter USER ID:");
        String userId = sc.nextLine();
        System.out.print("Enter PIN:");
        String pin = sc.nextLine();
        BankAccount currentAccount = null;
        if (acc1.validateUser(userId, pin)) {
            currentAccount = acc1;
        } 
        else if (acc2.validateUser(userId, pin)) {
            currentAccount = acc2;
        } 
        else if (acc3.validateUser(userId, pin)) {
            currentAccount = acc3;
        } 
        else if (acc4.validateUser(userId, pin)) {
            currentAccount = acc4;
        } 
        else if (acc5.validateUser(userId, pin)) {
            currentAccount = acc5;
        }
        if (currentAccount == null) {
            System.out.println("Invalid User ID or PIN");
            // return;
        }
        while (true) {
            System.out.println("\nATM MENU\n");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    currentAccount.showTransactionHistory();
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    sc.nextLine();
                    currentAccount.withdraw(withdrawAmt);
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    sc.nextLine();
                    currentAccount.deposit(depositAmt);
                    break;
                case 4:
                    // sc.nextLine();
                    System.out.print("Enter receiver User ID: ");
                    String receiverId = sc.nextLine();
                    BankAccount receiver = (receiverId.equals("user1")) ? acc1
                            : (receiverId.equals("user2")) ? acc2
                                    : (receiverId.equals("user3")) ? acc3
                                            : (receiverId.equals("user4")) ? acc4
                                                    : (receiverId.equals("user5")) ? acc5 : null;

                    if (receiver != null && receiver != currentAccount) {
                        System.out.print("Enter amount to transfer: ");
                        double transferAmt = sc.nextDouble();
                        sc.nextLine();
                        currentAccount.transfer(receiver, transferAmt);
                    } else {
                        System.out.println(" Invalid receiver ID ");
                    }
                    break;

                case 5:
                    System.out.println("\n Thank you for using ATM Service. Goodbye!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Transaction {
    String type;
    double amount;
    Date date;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.date = new Date();
    }

    public String toString() {
        return date + " | " + type + " | " + amount;
    }

}
class BankAccount {
    private String userId;
    private String userPin;
    private double balance;
    private ArrayList<Transaction> transactionHistory;
    public BankAccount(String userId, String userPin, double initialBalance) {
        this.userId = userId;
        this.userPin = userPin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean validateUser(String id, String pin) {
        return userId.equals(id) && userPin.equals(pin);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.println("Rs" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add(new Transaction("Withdraw", amount));
            System.out.println("Rs" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void transfer(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            receiver.balance += amount;
            transactionHistory.add(new Transaction("Transfer to " + receiver.userId, amount));
            receiver.transactionHistory.add(new Transaction("Transfer from " + this.userId, amount));
            System.out.println("Rs" + amount + " transferred to " + receiver.userId);
        } else {
            System.out.println("Transfer failed. Check balance or amount.");
        }
    }

    public void showTransactionHistory() {
        System.out.println("\n Transaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (Transaction t : transactionHistory) {
                System.out.println(t);
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getUserId() {
        return userId;
    }
}
