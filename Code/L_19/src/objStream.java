import javax.print.attribute.HashDocAttributeSet;
import java.io.*;

public class objStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File myFile = new File("text-file.txt");
        if(!myFile.exists()){
            myFile.createNewFile();
        }
        ObjectOutputStream objectOutputStream =
                new ObjectOutputStream(new FileOutputStream(myFile));

        Car car = new Car("211");
        User user = new User(4, "ali", car);

        objectOutputStream.writeObject(user);
        objectOutputStream.close();

        ObjectInputStream objectInputStream =
                new ObjectInputStream(new FileInputStream(myFile));

        User reUser = (User)objectInputStream.readObject();

        objectInputStream.close();

        System.out.println(reUser);

    }
}


class User implements Serializable {
    private int id;
    private String name;
    private Car car;

    public User(int id, String name, Car car) {
        this.id = id;
        this.name = name;
        this.car = car;
        car.ower = this;
    }

    @Override
    public String toString() {
        return id + ", name: " + name + "car: " + car;
    }
}


class Car implements Serializable{
    String model;
    User ower;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "model: " + model;
    }
}


