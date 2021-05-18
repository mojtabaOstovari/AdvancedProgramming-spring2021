import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Person> list = new LinkedList<>();
        Person p1 = new Person("Ali", 17, "male");
        Person p2 = new Person("Sara", 23, "female");
        Person p3 = new Person("reza", 15, "male");
        Person p4 = new Person("mehran", 25, "male");

        list.add(p1);list.add(p2);list.add(p3);list.add(p4);list.add(p1);

        Stream<Person> stream = list.stream();
        Optional<Person> optional =
                stream
                .peek((value)->{
                    value.name =value.name.toLowerCase();
                })
                .filter((value)->(value.age>16))
                .filter((value)->(value.gender.equals("female")))
                .distinct()
                .limit(6)
                .sorted(((o1, o2) -> o1.age-o2.age))
                .findFirst();

        if(optional.isPresent()){
            Person p = optional.get();
        }

    }
}

class Person{
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

