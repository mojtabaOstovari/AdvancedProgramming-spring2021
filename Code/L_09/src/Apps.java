import java.util.LinkedList;

public class Apps {
    public static void main(String[] args) {
        Context<User> context = new Context<>();
        User user = context.get(4);
        LinkedList<User> listUser = context.getAll();
    }
}

class User implements Copyable<User> {
    int id;
    int name;
    int password;
    Profile profile;

    public User copy(){
       return null;
    }

}

class Profile implements Copyable<Profile> {
    User owner;
    String email;

    public Profile copy(){
        return null;
    }

}

class Context<T>{
    public T get(int id) {
        ///
        return null;
    }
    public LinkedList<T> getAll() {
        ///
        return null;
    }
}

interface Copyable<T> {
    T copy();
}



