import java.util.LinkedList;

public class AbsCourse {
    int id;
    String name;
    int credit;
    LinkedList<AbsCourse> preCourse = new LinkedList<>();

    public AbsCourse(String name, int credit) {
        this.name = name;
        this.credit = credit;
    }
}
