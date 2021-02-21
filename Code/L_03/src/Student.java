import java.util.LinkedList;

public class Student {
    static int lastId = 0;
    final static LinkedList<Student> studentList = new LinkedList<>();
    static Student lastStudent;

    final int id;
    int year;
    String firstName;
    String lastName;
    String email;

    boolean isActive;

    Student(int year, String firstName, String lastName){
        studentList.add(this);
        lastStudent = this;

        lastId++;
        this.id = lastId * 100 + year;
        this.year = year;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Student(int year, String firstName, String lastName, String email){
        this(year, firstName, lastName);
        this.email=email;
    }

    String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    void setEmail(String email){
        this.email = email;
    }

    static int totalStudent(){
        return Student.lastId;
    }

}
