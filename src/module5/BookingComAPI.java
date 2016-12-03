package module5;

import java.util.Date;

/**
 * Created by merkulovvs on 12/1/2016.
 */
public class BookingComAPI implements API {
    Room[] rooms = new Room[5];

    public BookingComAPI() {
        Date date = new Date();
        rooms[0] = new Room(201, 70, 1, date, "Holiday Inn", "London");
        rooms[1] = new Room(202, 100, 2, date, "Marriott", "Novosibirsk");
        rooms[2] = new Room(203, 200, 2, date, "Hayatt", "Barcelona");
        rooms[3] = new Room(204, 150, 2, date, "Ramada", "Berlin");
        rooms[4] = new Room(205, 270, 2, date, "Regent", "Tokyo");
    }

    @Override
    public Room findRooms(int price, int persons, String city, String hotel) {
        Room[] result = new Room[1];
        Room searchRoom = new Room(0, price, persons, null, hotel, city);
        for(Room room : rooms)
            if(room.equals(searchRoom)){
            result[0] = room;
            break;
            }
        return result[0];
    }
}
