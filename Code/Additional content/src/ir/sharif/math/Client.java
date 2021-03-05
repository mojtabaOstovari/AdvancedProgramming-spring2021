package ir.sharif.math;

import java.util.ArrayList;

public class Client implements Cloneable {

    int a;
    ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        // using log
        printHi();
        printGoodBye();


        // cloning
        Client client = new Client();
        client.a = 4;
        client.list.add(5);
        Client client2 = client.clone();
        System.out.println(client2.list);
        client2.a = 3;
        client2.list.add(4);
        System.out.println(client.list);
        System.out.println(client2.list);

        System.out.println(client);
        System.out.println(client2);


        // using builder
        User user = new User.UserBuilder().setUsername("ap").setPassword("1234")
                .setEmail("Ap@sharif.ir").build();

    }

    static void printHi() {
//        MyLogger logger = new MyLogger();
        System.out.println("hi");
        MyLogger.getLogger().log("printed hi");
    }

    static void printGoodBye() {
//        MyLogger logger = new MyLogger();
        System.out.println("good bye");
        MyLogger.getLogger().log("printed good bye");
    }

    @Override
    public Client clone() {
        try {
            Client clone = (Client) super.clone();
            clone.list = new ArrayList<>(this.list);
            return clone;
        } catch (CloneNotSupportedException e) {
            // this shouldn't happen, since we are Cloneable
            e.printStackTrace();
            return null;
        }
    }
}
