package module5;

/**
 * Created by merkulovvs on 12/1/2016.
 */
public class DAOImpl implements DAO {
    @Override
    public Room save(Room room) {
        System.out.println("Room " + room.getId() + " is saved");
        return null;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Room " + room.getId() + " is deleted");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Room " + room.getId() + " is updated");
        return room;
    }

    @Override
    public Room findById(long id) {
        return null;
    }
}
