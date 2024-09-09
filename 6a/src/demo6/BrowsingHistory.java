package demo6;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowsingHistory {
    private Deque<String> history;
    private Deque<String> forwardHistory;
    private String currentPage;

    public BrowsingHistory() {
        history = new ArrayDeque<>();
        forwardHistory = new ArrayDeque<>();
        currentPage = null;
    }

    // Add a new page to the history
    public void visitPage(String page) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = page;
        forwardHistory.clear();
    }

    // Go back to the previous page
    public void goBack() {
        if (!history.isEmpty()) {
            forwardHistory.push(currentPage);
            currentPage = history.pop();
        } else {
            System.out.println("No previous page");
        }
    }

    // Go forward to the next page
    public void goForward() {
        if (!forwardHistory.isEmpty()) {
            history.push(currentPage);
            currentPage = forwardHistory.pop();
        } else {
            System.out.println("No next page");
        }
    }

    // Display the current page
    public void displayCurrentPage() {
        if (currentPage != null) {
            System.out.println("Current page: " + currentPage);
        } else {
            System.out.println("No page visited yet");
        }
    }

    public static void main(String[] args) {
        BrowsingHistory bh = new BrowsingHistory();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nBrowsing History");
            System.out.println("1. Visit Page");
            System.out.println("2. Go Back");
            System.out.println("3. Go Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String page = scanner.nextLine();
                    bh.visitPage(page);
                    break;
                case 2:
                    bh.goBack();
                    break;
                case 3:
                    bh.goForward();
                    break;
                case 4:
                    bh.displayCurrentPage();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
