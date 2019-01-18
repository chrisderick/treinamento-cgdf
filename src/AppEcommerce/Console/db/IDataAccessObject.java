package AppEcommerce.Console.db;

import java.util.List;

public interface IDataAccessObject<T> {
    void save(T obj);
    void update(T obj);
    void delete(Object id);
    List<T> getAll();
}
