import java.util.LinkedList;

public class Ge {
    public static void main(String[] args) {

        Shoes x = new Shoes();
        Product y = x;

//        LinkedList<B> lx = new LinkedList<>();
//        LinkedList<A> ly = lx;

        Shoes shoes = new Shoes();

        increasePrice(shoes);

        LinkedList<Shoes> list = new LinkedList<>();
        list.add(new Shoes());
        list.add(new Shoes());
        list.add(new YShoes());
        // list.add(new Product());

        LinkedList<Product> list2 = new LinkedList<>();

        show(list);
        increasePrice(list);
        copy(list, list2, new Product());

    }

    static void increasePrice(Product product){
        product.setPrice(product.getPrice()*1.2);
    }

    static void show(LinkedList<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }

    static void increasePrice(LinkedList<? extends Product> list) {
        for (Product product : list) {
            product.setPrice(product.getPrice()*1.2);
        }
    }

    static void addToList(LinkedList<? super Product> list) {
        list.removeLast();
        Shoes shoes = new Shoes();
        list.add(shoes);
    }

    <T> void copy0(LinkedList<? extends T> list1, LinkedList<T> list2){
        for (T p: list1) {
            list2.add(p);
        }
    }

    static <S extends T, T, E extends T> S copy(LinkedList<S> list1, LinkedList<T> list2, E e){
        for (T p: list1) {
            list2.add(p);
        }
        list2.add(e);
        return list1.getFirst();
    }

}

class Product {
    protected double price;
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Shoes extends Product {
}

class YShoes extends Shoes {
}
