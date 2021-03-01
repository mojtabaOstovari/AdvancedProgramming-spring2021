public abstract class Person {
    int id;
    int year;
    String firstName;
    String lastName;
    String email;

    boolean isActive;

    String getFullName(){
        return this.firstName + " " + this.lastName;
    }

    void setEmail(String email){
        this.email = email;
    }
}
