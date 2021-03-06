package repository;

import java.sql.SQLException;
import java.util.List;

import beans.PlantEntity;

/**
 * Interface for object with CRUD database method
 * @author Mia 
 *
 * @param <T>
 */

public interface DataAccessInterface <T>{

	public List<PlantEntity> findAll();
	public T findById(T t);
	public boolean create(T t) throws SQLException;
	public boolean update(T t) throws SQLException;
	public boolean delete(T t) throws SQLException;
}
