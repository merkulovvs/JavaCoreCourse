package module5;

import sun.security.krb5.internal.APOptions;

/**
 * Created by merkulovvs on 12/1/2016.
 */
public class BookingComAPI implements API {
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
