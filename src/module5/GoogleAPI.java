package module5;

import java.util.Date;

/**
 * Created by merkulovvs on 12/1/2016.
 */
public class GoogleAPI implements API{
    Room[] rooms = new Room[5];

    public GoogleAPI() {
        Date date = new Date();
        rooms[0] = new Room(101, 70, 1, date, "Holiday Inn", "London");
        rooms[1] = new Room(102, 130, 2, date, "Hilton", "Paris");
        rooms[2] = new Room(103, 800, 4, date, "Burj Khalifa", "Dubai");
        rooms[3] = new Room(104, 70, 1, date, "YHA", "London");
        rooms[4] = new Room(105, 100, 2, date, "Lybid", "Kiev");
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
