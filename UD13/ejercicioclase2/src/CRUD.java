import java.sql.SQLException;
import java.util.ArrayList;

public interface CRUD <T> {
    public ArrayList<T> query(String col, String valor) throws SQLException;
    public ArrayList<T> query(String column, int valor);
    public ArrayList<T> requestAll(String sorterBy);
    public T requestById(int id);
    public boolean create(T model);
    public boolean update(T model);
    public boolean delete(int id);
}
