import java.util.HashSet;
import java.util.LinkedList;

public class Ge {
    public static void main(String[] args) {

        B x = new B();
        A y = x;

        HashSet<B> lx = new HashSet<>();
        HashSet<A> ly = lx;


        B b = new B();

        increasePrice(b);

        LinkedList<B> list = new LinkedList<>();
        list.add(new B());
        list.add(new B());
        list.add(new C());

        increasePrice(list);

    }

    static void increasePrice(A a){
        a.setPrice(a.getPrice()*1.2);
    }

    static void increasePrice(LinkedList<A> list) {
        for (A a : list) {
            a.setPrice(a.getPrice()*1.2);
        }
    }

}

class A{
    protected double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class B extends A{
}

class C extends B{
}
