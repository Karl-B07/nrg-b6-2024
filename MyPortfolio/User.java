package MyPortfolio;

public class User {
    private int id;
    private int pin;
    private String name;
    private double balance;

    public User(int id, int pin, String name, double balance) {
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }
    public int getId() {
         return id; 
        }
        public int getPin() { 
            return pin; 
    }
        public String getName() { 
            return name; 
    }
    public double getBalance() { 
        return balance; 
    }
    
    public void setBalance(double balance) { 
         this.balance = balance; 
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
    @Override
    public String toString() {
        return " ID: " + id + " Name: " + name;
    }
}

