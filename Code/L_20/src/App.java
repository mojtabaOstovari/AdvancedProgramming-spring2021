import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {
        LinkedList<P> list = new LinkedList<>();
        list.add(new P(4, 8));
        list.add(new P(2, 11));
        list.add(new P(0, 7));
        list.add(new P(2, 2));

        Collections.sort(list, new MyComparator());

        Collections.sort(list, new Comparator<P>() {
            @Override
            public int compare(P o1, P o2) {
                return (o1.x - o2.x) + (o1.y - o2.y);
            }
        });

        Collections.sort(list, (o1, o2) -> (o1.x - o2.x + o1.y - o2.y) );


        MyInterface myInterface = (i, s, d) -> {
            //
            //
            return i + (int) d;
        };

        MyInterface1 myInterface1 = (s -> list.get(0).show(s));

        MyInterface1 m = list.get(0)::show;

        m.g("Ali");

        MyInterface2 m2 = P::new;

    }

    void sort(LinkedList<Integer> list, Comparator<Integer> comparator){
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (comparator.compare(max, list.get(i))>0){
                max = list.get(i);
            }
        }
    }

}

class P{
    int x;
    int y;

    public P(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{x: " + x + ", y: " + y + "}";
    }

    void show(String s){
        System.out.println("MyString: " + s);
    }
}

class MyComparator implements Comparator<P> {
    @Override
    public int compare(P o1, P o2) {
        return o1.y - o2.y;
    }
}

interface MyInterface{
    int g(int i, String s, double d);
}

interface MyInterface1{
    void g(String s);
}

interface MyInterface2{
    P h(int i, int j);
}


