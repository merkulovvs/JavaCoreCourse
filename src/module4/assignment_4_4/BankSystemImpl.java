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
        double balance = user.getBalance();
        balance+=(double)amount;
        user.setBalance(balance);

    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        double balanceFromUser = fromUser.getBalance();
        double balanceToUser = toUser.getBalance();
        balanceFromUser-=(double)amount;
        fromUser.setBalance(balanceFromUser);
        balanceToUser+=(double)amount;
        toUser.setBalance(balanceToUser);

    }

    @Override
    public void paySalary(User user) {
        double balance = user.getBalance();
        balance+=user.getSalary();
        user.setBalance(balance);
    }
}
