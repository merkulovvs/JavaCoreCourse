package module5;


/**
 * Created by merkulovvs on 12/1/2016.
 */
public class Controller {

    API apis[] = new API[3];
    Room[] DB = new Room[5];

    public Controller() {
        apis[0]= new BookingComAPI();
        apis[1]= new GoogleAPI();
        apis[2]= new TripAdvisorAPI();

    }

    Room[] requstRooms(int price, int persons, String city, String hotel) {
        int i = 0;
        for (API api : apis) {
            DB[i] = api.findRooms(price, persons, city, hotel);
            i++;
        }
        for (Room room : DB) {
            if (room != null) {
                System.out.println(room.toString());
            }
        }
        return null;
    }

    Room[] check(API api1, API api2){
        //int countEqualRooms =0;
        //Room[] result = new Room[countEqualRooms];
        //for(int i =0; i < api1.getRooms().length; i++){
        //    if ()
        return null;
        }
 }

