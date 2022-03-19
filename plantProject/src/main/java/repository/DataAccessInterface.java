package repository;

import java.sql.SQLException;
import java.util.List;

//Generic interface for handling database

public interface DataAccessInterface <T>{

	public List<T> findAll();
	public T findByID(int id);
	public boolean update(T t) throws SQLException;
	public boolean delete(T t) throws SQLException;
}
