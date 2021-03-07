import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        g(new A() {
            @Override
            void f() {
                System.out.println("Hello");
            }
        });

        k(new HInterface() {
            @Override
            public void h() {
                System.out.println(":D");
            }
        });

        k(new HInterface() {
            @Override
            public void h() {
                Scanner scan = new Scanner(System.in);
            }
        });
    }

    static void g(A a) {
        a.f();
    }

    static void k(HInterface o) {
        o.h();
    }
}

class A {
    void f() {
        System.out.println("hi");
    }
}

interface HInterface {
    void h();
}