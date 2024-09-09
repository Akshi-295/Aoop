package demo11;
public class BankOperations {
    private double balance;

    public BankOperations() {
        balance = 0.0;
    }

    public void viewBalance() {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            System.out.println("Current balance: $" + balance);
        } else {
            System.out.println("Please log in to view balance.");
        }
    }

    public void deposit(double amount) {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Please log in to deposit money.");
        }
    }

    public void withdraw(double amount) {
        UserLoginState loginState = UserLoginState.getInstance();
        if (loginState.isLoggedIn()) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Please log in to withdraw money.");
        }
    }
}
