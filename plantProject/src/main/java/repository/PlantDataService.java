package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

//Service for handling Plant database actions

public class PlantDataService implements DataAccessInterface<Object> {
	//connect
	String dURL = "jdbc:mysql://localhost:3306/plantDatabase";
	String user = "root";
	String pass = "root";
	
	Connection c = null;
	Statement stmt = null;
	int rowsAffected = 0;


	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object findByID(int id) {
		// TODO Auto-generated method stub
		return null;
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

}
