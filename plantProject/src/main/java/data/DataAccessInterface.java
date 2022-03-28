package data;

import java.sql.SQLException;
import java.util.List;

/**
 * Interface for object with CRUD database method
 * @author Mia 
 *
 * @param <T> object to be maintained with interface
 */

public interface DataAccessInterface <T>{

	/**
	 * Returns a list of all objects in database
	 * @return List
	 */
	public List<T> findAll();
	
	/**
	 * Returns object from database by id
	 * @param id
	 * @return
	 */
	public T findByID(int id);
	
	/**
	 * Create new object in database
	 * @param t
	 * @return
	 * @throws SQLException
	 */
	public boolean create(T t) throws SQLException;
	
	/**
	 * Update object in database
	 * @param t
	 * @return
	 * @throws SQLException
	 */
	public boolean update(T t) throws SQLException;
	
	/**
	 * Delete object in database
	 * @param t
	 * @return
	 * @throws SQLException
	 */
	public boolean delete(T t) throws SQLException;
}

