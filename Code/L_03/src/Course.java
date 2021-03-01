import java.util.LinkedList;

public class Course {
    int total;
    AbsCourse absCourse;
    DateTime examTime;

    public Course(int total) {
        this.total = total;
    }

    public Course(int total, AbsCourse absCourse, DateTime examTime) {
        this.total = total;
        this.absCourse = absCourse;
        this.examTime = examTime;
    }

    LinkedList<Teacher> TeacherList = new LinkedList<>();
    LinkedList<Student> studentList = new LinkedList<>();
}
