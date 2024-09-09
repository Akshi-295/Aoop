package demo4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoListApplication {
    private List<String> tasks;

    public ToDoListApplication() {
        tasks = new ArrayList<>();
    }

    // Add a task to the list
    public void addTask(String task) {
        tasks.add(task);
    }

    // Update a task's description
    public void updateTask(int index, String newTask) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, newTask);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Remove a task by its index
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    // Display all tasks
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void main(String[] args) {
        ToDoListApplication tdl = new ToDoListApplication();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Update Task");
            System.out.println("3. Remove Task");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String task = scanner.nextLine();
                    tdl.addTask(task);
                    break;
                case 2:
                    System.out.print("Enter task number to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new task description: ");
                    String newTask = scanner.nextLine();
                    tdl.updateTask(updateIndex, newTask);
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = scanner.nextInt() - 1;
                    tdl.removeTask(removeIndex);
                    break;
                case 4:
                    tdl.displayTasks();
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

