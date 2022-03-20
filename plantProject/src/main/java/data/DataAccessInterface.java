package data;

import java.sql.SQLException;
import java.util.List;

/**
 * Interface for object with CRUD database method
 * @author Mia 
 *
 * @param <T>
 */

public interface DataAccessInterface <T>{

	public List<T> findAll();
	public T findByID(int id);
	public boolean create(T t) throws SQLException;
	public boolean update(T t) throws SQLException;
	public boolean delete(T t) throws SQLException;
}

