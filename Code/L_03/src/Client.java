public class Client {
    public static void main(String[] args) {
//        Student student1 = new Student(99, "ali", "hn");
//        student1.setEmail("ali_hn@y.com");
//        String name = student1.lastName;
//
//        String fullName = student1.getFullName();
//        System.out.println(student1.id);
//
//        int x = Student.totalStudent();
//
//        Student student2 = student1;
//
//        student2.lastName = "bn";
//
//        System.out.println(student1.firstName + " " + student1.lastName);
//        System.out.println(student2.firstName + " " + student2.lastName);
//
//        int a = 1;
//        int b = a;

        Date date1 = new Date(1399, 10, 20);
        DateTime dt = new DateTime(1398, 10, 20, 5, 47, 8);
        int i = 0;
        int j = i;

        Object d1 = dt;
        DateTime d2 = dt;
        Date d3 = dt;

        int h = ((DateTime)d3).hour;

        d3.f();
        // d3.getHour();

    }

    int f(){return 0;}
    int f(int a){return a+2;}
    int f(double a){return (int)a;}
}
