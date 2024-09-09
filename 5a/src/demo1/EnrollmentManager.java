package demo1;
public class EnrollmentManager {
    public void enroll(Student student, Course course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }
}
	