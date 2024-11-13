package MyPortfolio;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {
    private ArrayList<User> users;
    private User loggedInUser;
    private Scanner scanner;

    public BankApp() {
        users = new ArrayList<>();
        scanner = new Scanner(System.in);
        BuiltInUsers();
    }

    private void BuiltInUsers() {
        users.add(new User(412435, 7452, "Chris Sandoval", 32000));
        users.add(new User(264863, 1349, "Marc Yim", 1000));
    }

    public void start() {
        boolean running = true;
        while (running) {
            try{
            System.out.println("\nWelcome to the Banking App");
            System.out.println("1. Login");
            System.out.println("2. Create Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
    int choice = scanner.nextInt();
    switch (choice) {
           case 1: login(); break;
            case 2: createAccount(); break;
            case 3: {
            System.out.println("Exiting the application. Thank you!");
            System.exit(0) ; break;
            }default:
            System.out.println("");
            System.out.println("Invalid option. Please try again.");
            break;
        }
    }   
        catch (InputMismatchException e) {
            System.out.println("");
            System.out.println("Invalid input. Please enter a number.");
            scanner.next();
            }
        } 
       scanner.close();
    }

    private void login() {
        System.out.print("Enter user ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter 4-digit PIN: ");
        int pin = scanner.nextInt();
        User user = findUserId(id);
        if (user != null && user.getPin() == pin) {
            loggedInUser = user;
            System.out.println("");
            System.out.println("Login successful. Welcome, " + loggedInUser.getName() + "!");
            showUserMenu();
        } else {
            System.out.println("Invalid ID or PIN.");
        }
    }
    private User findUserId(int id) {
        for (User user : users) {
            if (user.getId() == id) {
            return user;
            }
        }return null;
    }
    private void createAccount() {
        System.out.print("Enter new user ID (6 digits): ");
        int id = scanner.nextInt();
        if (findUserId(id) != null) {
            System.out.println("User ID already exists. Try a different ID.");
            return;
        }

        System.out.print("Enter a 4-digit PIN: ");
        int pin = scanner.nextInt();
        scanner.nextLine(); // encountered the same here on skipping due to nextInt()
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        User newUser = new User(id, pin, name, balance);
        users.add(newUser);
        System.out.println();
        System.out.println("Account created successfully!");
        System.out.println("Please Log-in to confirm your account");
        login();
    }

    private void showUserMenu() {
        boolean loggedIn = true;
        while (loggedIn) {
            try{
            System.out.println("\n1. Check Balance");
            System.out.println("2. Cash-In");
            System.out.println("3. Transfer Money");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

        switch (choice) {
            case 1: checkBalance(); break;
            case 2: cashIn(); break;
            case 3: transferMoney(); break;
            case 4:
                System.out.println("Logging out...");
                    start(); 
                    break;
            default: System.out.println("Invalid option. Please try again."); break;
        }
    } catch (InputMismatchException e){
        System.out.println("");
        System.out.println("Invalid option. Please try again12.");
        scanner.nextLine();
    }
    }
}

    private void checkBalance() {
        System.out.println("");
        System.out.println("Your balance is: " + loggedInUser.getBalance());
    }

    private void cashIn() {
        try{
        System.out.print("Enter amount to cash in: ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            loggedInUser.setBalance(loggedInUser.getBalance() + amount);
            System.out.println("");
            System.out.println("Cash-in successful. Your balance is: " + loggedInUser.getBalance());
        } 
    }
    catch (InputMismatchException e){
        System.out.println("");
        System.out.println("Invalid. Try it again ");
        scanner.nextLine();
    }
    }
    private void transferMoney(){
           try{
        for (User user : users) {
                if (user != loggedInUser)
               System.out.println(user);
            }
        System.out.print("Enter recipient user ID: ");
        int recipientId = scanner.nextInt();
        User recipient = findUserId(recipientId);
        if (recipient != null && recipient != loggedInUser) {
            System.out.print("Enter amount to transfer: ");
            double amount = scanner.nextDouble();
            if (amount > 0 && loggedInUser.getBalance() >= amount) {
                loggedInUser.setBalance(loggedInUser.getBalance() - amount);
                recipient.setBalance(recipient.getBalance() + amount);
                System.out.println("Transfer successful to "+recipient.getName()+ ". "+ " Your remaining balance is: " + loggedInUser.getBalance());
            } else {
                System.out.println("");
                System.out.println("Invalid amount or insufficient balance.");
                transferMoney();
            }
        } else {
            System.out.println("");
            System.out.println("Recipient not found or invalid.");
            transferMoney();
        }
    } catch (InputMismatchException e){
        System.out.println("Invalid. Try it again "); // to run again the transfer
        scanner.nextLine();
    }

    }
}