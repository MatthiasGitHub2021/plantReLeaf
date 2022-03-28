package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import beans.PlantEntity;

/**
 * Crud Repository for Plant objects
 * @author mia
 *
 */

public class PlantDataService implements DataAccessInterface<Object> {
	//connect
	String dURL = "jdbc:mysql://localhost:3306/plantDatabase";
	String user = "root";
	String pass = "root";
	
	Connection c = null;
	Statement stmt = null;
	int rowsAffected = 0;


	@Override
	public List<PlantEntity> findAll(){
		
		//List to hold plant entities returned from database
		List<PlantEntity> plant = new ArrayList<PlantEntity>();
		
		try {
			// Create Iterable Object of PlantEntity from database query
						Iterable<PlantEntity> PlantIterable = plantRepository.findAll();

						// For each item in Iterable Object, add to List of PlantEntity
						PlantIterable.forEach(plant::add);
					} 
					catch (Exception e) {
						e.printStackTrace();
					}

					// Return List of PlantEntities
					return plant;
		
	}

	@Override
	public PlantEntity findById(Object t) {
		
		// Optional Object to hold CoffeeEntity returned from database by id
		Optional<PlantEntity> plant = plantRepository.findById((long) t);
	
		// If Optional Object !null, return PlantEntity, else throw NoSuchElement Exception
		return plant.get();
	}

	@Override
	public boolean update(Object t) throws SQLException {
		try {
			c = DriverManager.getConnection(dURL, user, pass);
			System.out.println("Connection is successful");
			
			//create SQL statement
			stmt = c.createStatement();
			
			//execute the statement 
			rowsAffected = stmt.executeUpdate("Update plantDatabase.plant table set 'name' = 'Rose' where name = 'Daisy'");
			
			//success message
			System.out.println("Rows affected " + rowsAffected);
					
					

		} catch (SQLException e) {
			System.out.print("YOU DID SOMETING WORNG BUDDY");
			e.printStackTrace();
		} finally {
			//close the connection to db
			
			stmt.close();
			c.close();

		}
		return false;
	}

	@Override
	public boolean delete(Object t) throws SQLException {
		

				
				try {
					c = DriverManager.getConnection(dURL, user, pass);
					System.out.println("Connection is successful");
					
					//create SQL statement
					stmt = c.createStatement();
					
					//execute the statement 
					rowsAffected = stmt.executeUpdate("Delete plantDatabase.plant table where name = Daisy ");
					
					//success message
					System.out.println("Rows affected " + rowsAffected);
							
							

				} catch (SQLException e) {
					System.out.print("YOU DID SOMETING WORNG BUDDY");
					e.printStackTrace();
				} finally {
					//close the connection to db
					
					stmt.close();
					c.close();

				}
		return false;
	}
	
	public boolean create(Object t) {

		try	{
			// Attempt to save new PlantEntity to database
			//todo make DAO and plantRepository connect to mysql
			plantRepository.save(t);
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}

		return true;
	}

}
