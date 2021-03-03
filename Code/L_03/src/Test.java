import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        LocalDate ld = LocalDate.now();
        //System.out.println(ld);
        LocalDate ld1 = LocalDate.of(2017, 10, 4);
        //LocalDate ld2 = LocalDate.of(2018, 30, 40);
        LocalTime lt = LocalTime.of(5, 22, 10);
        //System.out.println(LocalTime.now());
        //System.out.println(LocalDateTime.now());

        for (int i = 0; i < 10; i++) {
            Thread.sleep(2000);
            long cms = System.currentTimeMillis();
            System.out.println(cms);
        }

        A a = new A();
        A.B b = new A.B();
        int t = A.sa;
        A.f();

        A.C c = a.new C();

    }
}


class A {
    int field;
    static int sa = 5;

    static class B {
        int field2;
    }

    class C {
        int field3;
    }

    static int f() {return 0;}

    static void g() {
        f();
        B bb = new B();
    }
}


