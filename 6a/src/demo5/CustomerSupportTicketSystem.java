package demo5;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerSupportTicketSystem {
    private Queue<String> tickets;

    public CustomerSupportTicketSystem() {
        tickets = new LinkedList<>();
    }

    // Add a new ticket to the queue
    public void addTicket(String ticket) {
        tickets.add(ticket);
    }

    // Process (remove) the next ticket in line
    public void processNextTicket() {
        if (!tickets.isEmpty()) {
            System.out.println("Processing ticket: " + tickets.poll());
        } else {
            System.out.println("No tickets to process");
        }
    }

    // Display all pending tickets
    public void displayPendingTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No pending tickets");
        } else {
            for (String ticket : tickets) {
                System.out.println(ticket);
            }
        }
    }

    public static void main(String[] args) {
        CustomerSupportTicketSystem csts = new CustomerSupportTicketSystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nCustomer Support Ticket System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Process Next Ticket");
            System.out.println("3. Display Pending Tickets");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ticket description: ");
                    String ticket = scanner.nextLine();
                    csts.addTicket(ticket);
                    break;
                case 2:
                    csts.processNextTicket();
                    break;
                case 3:
                    csts.displayPendingTickets();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
