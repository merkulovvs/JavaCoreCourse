package module7;

import java.util.Currency;

/**
 * Created by merkulovvs on 12/17/2016.
 */
public class Order {
    long id;
    int price;
    Currency currency;
    String itemName;
    String shopIdentificator;
    User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }
}
