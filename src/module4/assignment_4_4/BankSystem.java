package module4.assignment_4_4;

import module4.assignment_4_3.User;

/**
 * Created by merkulovvs on 11/24/2016.
 */
public interface BankSystem {

    void withdrawOfUser(User user, double amount);
    void fundUser(User user, int amount);
    void transferMoney(User fromUser, User toUser, int amount);
    void paySalary(User user);
}
