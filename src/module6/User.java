package module6;

/**
 * Created by merkulovvs on 12/8/2016.
 */
public class User {
    long id;
    String firstName;
    String lastName;
    int salary;
    int balance;

    public User(long id, String firstName, String lastName, int salary, int balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.balance = balance;
    }
}
