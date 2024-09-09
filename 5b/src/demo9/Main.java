package demo9;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 70000));
        employees.add(new Employee(1, "Bob", 50000));
        employees.add(new Employee(2, "Charlie", 60000));

        
        Collections.sort(employees);
        System.out.println("Sorted by ID:");
        for (Employee e : employees) {
            System.out.println(e);
        }

       
        Collections.sort(employees, Employee.NameComparator);
        System.out.println("\nSorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

      
        Collections.sort(employees, Employee.SalaryComparator);
        System.out.println("\nSorted by Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }

      
        try {
            Employee clonedEmployee = (Employee) employees.get(0).clone();
            System.out.println("\nCloned Employee: " + clonedEmployee);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
