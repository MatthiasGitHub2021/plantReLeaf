package business;

import javax.ejb.Local;

import beans.UserEntity;

/**
 * Interface for user to interact with database
 * @author matth
 *
 */

@Local
public interface UserInterface {
	
	/**
	 * Method for returning a user entity
	 * 
	 * @return a List of type u
	 */
	public void getFirstName(UserEntity u);
	public void getLastName(UserEntity u);
	public void getPhoneNumber(UserEntity u);
	public void getEmail(UserEntity u);
	public void getUserName(UserEntity u);
	public void getPassWord(UserEntity u);


}
