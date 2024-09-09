package demo1;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int id;
    private List<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", courses=" + courses +
                '}';
    }
}

