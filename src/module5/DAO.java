package module5;

/**
 * Created by merkulovvs on 12/1/2016.
 */
public interface DAO {
    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
