package demo11;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankOperations bankOperations = new BankOperations();
        UserLoginState loginState = UserLoginState.getInstance();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nBanking System");
            System.out.println("1. Login");
            System.out.println("2. Logout");
            System.out.println("3. View Balance");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loginState.login();
                    System.out.println("Logged in successfully.");
                    break;
                case 2:
                    loginState.logout();
                    System.out.println("Logged out successfully.");
                    break;
                case 3:
                    bankOperations.viewBalance();
                    break;
                case 4:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankOperations.deposit(depositAmount);
                    break;
                case 5:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    bankOperations.withdraw(withdrawAmount);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}

