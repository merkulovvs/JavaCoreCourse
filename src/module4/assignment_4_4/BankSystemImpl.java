package module4.assignment_4_4;

import module4.assignment_4_3.User;

/**
 * Created by merkulovvs on 11/24/2016.
 */
public class BankSystemImpl implements BankSystem {
    @Override
    public void withdrawOfUser(User user, double amount) {
        double balance = user.getBalance();
        balance-= amount;
        user.setBalance(balance);
    }

    @Override
    public void fundUser(User user, int amount) {

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {

    }

    @Override
    public void paySalary(User user) {

    }
}
