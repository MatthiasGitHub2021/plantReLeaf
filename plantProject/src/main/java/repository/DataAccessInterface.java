package repository;

import java.util.List;

//Generic interface for handling database

public interface DataAccessInterface <T>{

	public List<T> findAll();
	public T findByID(int id);
	public boolean update(T t);
	public boolean delete(T t);
}
