package module4.assignment_4_5;

import module4.assignment_4_1.ChinaBank;
import module4.assignment_4_1.EUBank;
import module4.assignment_4_1.USBank;
import module4.assignment_4_2.Currency;
import module4.assignment_4_3.User;
import module4.assignment_4_4.BankSystem;
import module4.assignment_4_4.BankSystemImpl;

import java.lang.reflect.Array;


/**
 * Created by merkulovvs on 11/24/2016.
 */
public class Main4 {


    public static void main(String[] args) {
        USBank bankOfAmerica = new USBank(1258005, "USA", Currency.USD, 30000,
                100000, 100, 100000000);
        USBank chaseCooper = new USBank(3520085, "USA", Currency.USD, 40000,
                90000, 150, 800000000);
        EUBank deucheBank = new EUBank(5788005, "Germany", Currency.EUR, 60000,
                85200, 200, 256000000);
        EUBank raiffeizenBank = new EUBank(5580015, "Austria", Currency.EUR, 30000,
                98522, 320, 100000000);
        ChinaBank PBC = new ChinaBank(8845222, "China", Currency.USD, 80000,
                30000, 85, 1000000000);
        ChinaBank chinaDevBank = new ChinaBank(5852441, "China", Currency.USD, 70000,
                25000, 78, 100000000);
        User user1 = new User(11233445, "Woodward, Samantha", 1200000, 72,
                                "Cisco Inc.", 90000, bankOfAmerica);
        User user2 = new User(10222928, "Burkdull, Greg", 10098, 9,
                "Custco LLC", 60000, chaseCooper);
        User user3 = new User(52582245, "Muller, Gans", 152000, 42,
                "BMW", 120000, deucheBank);
        User user4 = new User(25285220, "Shutze, Sebastian", 98000, 13,
                "Putzmeister", 80000, raiffeizenBank);
        User user5 = new User(35868544, "Bo, Wu Qian", 5000, 25,
                "XieXie", 10000, PBC);
        User user6 = new User(35255882, "Chang, Zu", 1000, 5,
                "Miezu", 6000, chinaDevBank);

       BankSystemImpl test1 = new BankSystemImpl();
       System.out.println("Before withdrawal user1 has " + user1.getBalance() + " on account.");
       test1.withdrawOfUser(user1, 200000.0);
       System.out.println("After withdrawal user1 has " + user1.getBalance() + " on account.\n" +
               "--------------------------------------------------");
       System.out.println("Before funding user3 has " + user3.getBalance() + " on account.");
       test1.fundUser(user3, 385);
       System.out.println("After funding user3 has " + user3.getBalance() + " on account.\n" +
               "--------------------------------------------------");
       System.out.println("User4 transfers funds to user5\n" +
                           "Before transfer user4 has " + user4.getBalance() + " on account.\n" +
                           "Before transfer user5 has " + user5.getBalance() + " on account.");
       test1.transferMoney(user4,user5,8000);
        System.out.println("After transfer user4 has " + user4.getBalance() + " on account.\n" +
                           "After transfer user 5 has " + user5.getBalance() + " on account.\n" +
                "--------------------------------------------------");
        System.out.println("Before payday user6 has " + user6.getBalance() + " on account.");
        test1.paySalary(user6);
        System.out.println("After payday user6 has " + user6.getBalance() + " on account.\n" +
                "--------------------------------------------------");


        System.out.println(user1 + "---------------------------");
        System.out.println(user2 + "---------------------------");
        System.out.println(user3 + "---------------------------");
        System.out.println(user4 + "---------------------------");
        System.out.println(user5 + "---------------------------");
        System.out.println(user6 + "---------------------------");


    }
}