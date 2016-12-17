package module7;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by merkulovvs on 12/17/2016.
 */
public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "David", "Smith", "New York", 2000);
        User user2 = new User(2, "Sarah", "Konnor", "Los Angeles", 2000);
        User user3 = new User(3, "Susan", "Hilton", "Salt Lake City", 2000);
        User user4 = new User(4, "Roger", "Stegeby", "Stockholm", 2000);
        User user5 = new User(5, "Uli", "Dietrich", "Dresden", 2000);
        User user6 = new User(6, "Benjamen", "Leg", "London", 2000);
        User user7 = new User(7, "Michael", "Tulane", "Rexburg", 2000);
        User user8 = new User(8, "Anthony", "Panek", "Provo", 586980);
        User user9 = new User(9, "David", "Jaurch", "Munich", 500);
        User user10 = new User(10, "James", "Woodward", "Cottonwood", 100000);

        Order order1 = new Order(1, 250, Currency.getInstance(Locale.US), "DVD player",
                "Amazon", user1);
        Order order2 = new Order(2, 1500, Currency.getInstance(Locale.US), "Laptop",
                "Amazon", user2);
        Order order3 = new Order(3, 700, Currency.getInstance(Locale.US), "TV Set",
                "Ebay", user3);
        Order order4 = new Order(4, 250, Currency.getInstance(Locale.US), "Coat",
                "H&M", user4);
        Order order5 = new Order(5, 20, Currency.getInstance(Locale.US), "Kitchen set",
                "Amazon", user5);
        Order order6 = new Order(6, 59, Currency.getInstance(Locale.US), "Chair",
                "Amazon", user6);
        Order order7 = new Order(7, 2000, Currency.getInstance(Locale.US), "Stove",
                "Amazon", user7);
        Order order8 = new Order(8, 1200, Currency.getInstance(Locale.US), "Fridge",
                "Amazon", user8);
        Order order9 = new Order(1, 250, Currency.getInstance(Locale.US), "PC",
                "Amazon", user9);
        Order order10 = new Order(10, 30000, Currency.getInstance(Locale.US), "BMW",
                "Car Dealer", user10);




    }
}
