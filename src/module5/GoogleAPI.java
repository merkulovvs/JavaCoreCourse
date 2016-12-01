package module5;

/**
 * Created by merkulovvs on 12/1/2016.
 */
public class GoogleAPI implements API{
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[0];
    }
}
