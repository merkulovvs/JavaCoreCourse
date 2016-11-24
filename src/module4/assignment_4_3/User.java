package module4.assignment_4_3;

import module4.assignment_4_1.Bank;

/**
 * Created by merkulovvs on 11/22/2016.
 */
public class User {
    long id;
    String name;
    double balance;
    int monthsOfEmployment;
    String companyName;
    int salary;
    Bank bank;

    public User(long id, String name, double balance, int monthsOfEmployment,
                String companyName, int salary, Bank bank) {
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.bank = bank;
    }
}
