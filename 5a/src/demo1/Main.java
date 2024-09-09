package demo1;
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        Course course1 = new Course("CS101", "Introduction to Computer Science");
        Course course2 = new Course("MATH101", "Calculus I");

        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.enroll(student1, course1);
        enrollmentManager.enroll(student2, course2);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(course1);
        System.out.println(course2);
    }
}
