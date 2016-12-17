package module7;

/**
 * Created by merkulovvs on 12/17/2016.
 */
public class User {
    long id;
    String firstName;
    String lastName;
    String city;
    int balance;

    public User(long id, String firstName, String lastName, String city, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.balance = balance;
    }
}
