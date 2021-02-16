import java.util.HashSet;
import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        LinkedList<Integer> myList2 = new LinkedList<>();
        myList2.addFirst(88);
        myList2.addFirst(99);

        myList.add(5);
        myList.add(2);
        myList.add(7);
        myList.add(1, 6);

        // myList.set(1, 8);
        // myList.remove(0);

        int a = myList.pop();
        myList.addFirst(0);

        // System.out.println(myList.size());

        int x = myList.get(1);
        System.out.println(x);
        System.out.println(myList.contains(9));;
        System.out.println(myList.indexOf(10));


        //System.out.println(myList);
        //System.out.println(myList2);

        myList.addAll(myList2);

        LinkedList<Integer> myList3 = new LinkedList<>(myList2);

        //System.out.println(myList);
        //System.out.println(myList3);

        HashSet<Integer> mySet1 = new HashSet<>();
        HashSet<Integer> mySet2 = new HashSet<>();
        mySet1.add(1);mySet1.add(4);mySet1.add(7);
        mySet2.add(2);mySet2.add(4);mySet2.add(8);

        // mySet1.addAll(mySet2);
        // mySet1.removeAll(mySet2);
        // mySet1.retainAll(mySet2);

        // mySet1.remove(7);
        boolean b = myList.contains(4);
        boolean b1 = mySet1.containsAll(mySet2);

        System.out.println(mySet1);

    }
}
