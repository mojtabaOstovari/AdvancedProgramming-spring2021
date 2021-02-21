public class Client {
    public static void main(String[] args) {
        Student student1 = new Student(99, "ali", "hn");
        student1.setEmail("ali_hn@y.com");
        String name = student1.lastName;

        String fullName = student1.getFullName();
        System.out.println(student1.id);

        int x = Student.totalStudent();

        Student student2 = student1;

        student2.lastName = "bn";

        System.out.println(student1.firstName + " " + student1.lastName);
        System.out.println(student2.firstName + " " + student2.lastName);

        int a = 1;
        int b = a;

    }
}
