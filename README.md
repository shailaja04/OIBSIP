## **Task :1**
# ATM INTERFACE
This is a simple console-based **ATM Program** made using Java.  
It allows the user to log in and perform basic banking operations.
## Features
- Login using User ID and PIN  
- Deposit money  
- Withdraw money  
- Transfer money to another user  
- View transaction history  
- Exit the program  
## Technologies Used
- Java  
- OOP concepts  
- ArrayList  
- Scanner for input  
## How to Run
1. Compile the program:
javac ATM.java
2. Run the program:
java ATM
## Default Test Accounts
- user1 / 12345  
- user2 / 56789  
- user3 / 19876  
- user4 / 16543  
- user5 / 98345  
**OUTPUT:**

WELCOME TO ATM SERVICE
Enter USER ID:user1
Enter PIN:12345
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 1  
 Transaction History:
No transactions yet.
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 2
Enter amount to withdraw: 7000
Rs7000.0 withdrawn successfully.
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 2
Enter amount to withdraw: 500
Rs500.0 withdrawn successfully.
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 1
 Transaction History:
Sat Nov 22 19:20:47 IST 2025 | Withdraw | 7000.0
Sat Nov 22 19:20:57 IST 2025 | Withdraw | 500.0
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 3
Enter amount to deposit: 4000
Rs4000.0 deposited successfully.
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 1
 Transaction History:
Sat Nov 22 19:20:47 IST 2025 | Withdraw | 7000.0
Sat Nov 22 19:20:57 IST 2025 | Withdraw | 500.0
Sat Nov 22 19:21:04 IST 2025 | Deposit | 4000.0
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 4
Enter receiver User ID: user2
Enter amount to transfer: 2000
Rs2000.0 transferred to user2
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 1
Transaction History:
Sat Nov 22 19:20:47 IST 2025 | Withdraw | 7000.0
Sat Nov 22 19:20:57 IST 2025 | Withdraw | 500.0
Sat Nov 22 19:21:04 IST 2025 | Deposit | 4000.0
Sat Nov 22 19:21:14 IST 2025 | Transfer to user2 | 2000.0
ATM MENU
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Quit
Enter your choice: 5
Thank you for using ATM Service. Goodbye!
## **Task :2**
# Number Guessing Game
This is a simple Java console game where the user tries to guess a random number between 1 and 100.  
The game gives the player 10 attempts and awards points based on how quickly they guess the number.
## Features
- Random number generation (1–100)
- 10 attempts per round
- Score system (fewer attempts = more points)
- Option to play multiple rounds
- Simple and fun console game
## How to Run
1. Compile the program:
javac GuessTheNumber.java
2. Run the program:
java GuessTheNumber
## Gameplay Rules
- You have **10 attempts** to guess the number.
- If you guess correctly, you earn points.
- If you fail, the correct number is shown.
- You can choose to play again.
**OUTPUT**
  Welcome to GuessTheNumber Game!
I'm thinking of a number between 1 and 100.
You have 10 attempts to guess it.
Enter your guess: 50
Too low! Try again.
Enter your guess: 70
Too low! Try again.
Enter your guess: 90
Too low! Try again.
Enter your guess: 95
Too high! Try again.
Enter your guess: 93
Correct! You guessed the number in 5 attempts.
You earned 60 points this round!
Your total score : 60
Do you want to play another round? (yes/no):
## **Task :3**
## Digital library management
This is a simple Library Management System built using Java.  
It allows both **Admin** and **Users** to manage books through a console-based menu.
## Features
###  Admin
- Add Book  
- Update Book  
- Delete Book  
- View All Books  
(Default Admin Login)  
- Username: **admin**  
- Password: **admin@123**
### User
- View all books  
- Issue a book  
- Return a book  
## Technologies Used
- Java  
- ArrayList  
- Scanner for input  
- Basic OOP concepts  
## How to Run
1. Compile:
javac LibraryManagementSystem.java
2. Run:
java LibraryManagementSystem
## **OUTPUT**
Library Management System
1. Admin Login
2. User Access
3. Exit
Enter your choice: 1
Enter admin username: admin
Enter admin password: admin@123
Admin Menu
1. Add Book
2. Update Book      
3. Delete Book      
4. View All Books   
5. Back to Main Menu
Enter your choice: 1
Enter Book ID: 101
Enter Book Title: java
Enter Book Author: james
Book added successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books       
5. Back to Main Menu
Enter your choice: 1
Enter Book ID: 102
Enter Book Title: C
Enter Book Author: Danis
Book added successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 2
Enter Book ID to update: 102
Enter new Title: Python
Enter new Author: Van
Book updated successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 3
Enter Book ID to delete: 101
Book deleted successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 4
 All Books
ID: 102, Title: Python, Author: Van, Issued: No
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 1
Enter Book ID: 103
Enter Book Title: DAA
Enter Book Author: Charlies
Book added successfully!
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 4
 All Books
ID: 102, Title: Python, Author: Van, Issued: No
ID: 103, Title: DAA, Author: Charlies, Issued: No
Admin Menu
1. Add Book
2. Update Book
3. Delete Book
4. View All Books
5. Back to Main Menu
Enter your choice: 5
Returning to main menu...
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 1
 All Books
ID: 102, Title: Python, Author: Van, Issued: No
ID: 103, Title: DAA, Author: Charlies, Issued: No
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 2
Enter Book ID to issue (0 to go back): 101
Book not found!
Enter Book ID to issue (0 to go back): 102
Book issued successfully!
Enter Book ID to issue (0 to go back): 103
Book issued successfully!
Enter Book ID to issue (0 to go back): 0
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 3
Enter Book ID to return (0 to go back): 102
Book returned successfully!
Enter Book ID to return (0 to go back): 103
Book returned successfully!
Enter Book ID to return (0 to go back): 0
User Menu
1. View All Books
2. Issue Book
3. Return Book
4. Back to Main Menu
Enter your choice: 4
Returning to main menu...
Exiting system. Goodbye!
Invalid choice. Try again.
Library Management System
1. Admin Login
2. User Access
3. Exit
Enter your choice: 3
Exiting system. Goodbye!
Invalid choice. Try again.
## **Task :4 **
## Online reservation system
###  Book a ticket
###  Cancel a ticket
###  View all booked tickets
And **login is required** (username: admin, password: admin@123)
## **Reservation Class**
This class stores **one passenger’s booking details**:
* name
* age
* train number
* train name
* class
* journey date
* from – to
* PNR number
It also has a `display()` method to print the ticket.
## **Login System**
Before using the reservation system, the program asks:
Enter username:
Enter password:
Only if both match:
admin
admin@123
the user can continue.
## ** Menu (Loop)**
After login, the program keeps showing:
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
The user chooses what to do.
# **What Each Function Does**
## **bookReservation()**
Asks the user for:
* name
* age
* train details
* journey date
* source
* destination
Then it **creates a new PNR like:**
PNR1, PNR2, PNR3 ...
Then adds it to the list of reservations.
 Prints success message.
## **cancelReservation()**
* Asks for PNR
* Searches in the list
* If found → shows details → asks:
Confirm cancellation? (yes/no)
If yes → deletes reservation.
## **viewReservations()**
Prints all booked reservations using the `display()` method.
## **OUTPUT**
Enter username: admin
Enter password: admin@123
Online Reservation System 
1. Book Reservation       
2. Cancel Reservation     
3. View All Reservations  
4. Exit
Enter your choice: 1      
Enter Name: abc
Enter Age: 24
Enter Train Number: 127127
Enter Train Name: godavari express
Enter Class Type: sleeper
Enter Date of Journey (DD/MM/YYYY): 25/12/2025
From: hyderabad
To: visakhapatnam
Reservation Successful! Your PNR: PNR1
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 3
All Reservations
PNR: PNR1
Name: abc
Age: 24
Train No: 127127
Train Name: godavari express
Class: sleeper
Date of Journey: 25/12/2025
From: hyderabad To: visakhapatnam
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 2
Enter PNR to cancel: pnr1
PNR: PNR1
Name: abc
Age: 24
Train No: 127127
Train Name: godavari express
Class: sleeper
Date of Journey: 25/12/2025
From: hyderabad To: visakhapatnam
Confirm cancellation? (yes/no): yes
Reservation cancelled successfully!
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 3
No reservations found.
Online Reservation System
1. Book Reservation
2. Cancel Reservation
3. View All Reservations
4. Exit
Enter your choice: 4
Exiting system. Goodbye!


