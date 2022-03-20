package business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.UserEntity;

/**
 * Session Bean implementation class UserService
 */
@Stateless
@LocalBean
public class UserService implements UserInterface {

    /**
     * Default constructor. 
     */
    public UserService() {
        // TODO Auto-generated constructor stub
    }

    
    //getters/setters
	@Override
	public void getFirstName(UserEntity u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLastName(UserEntity u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPhoneNumber(UserEntity u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmail(UserEntity u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserName(UserEntity u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPassWord(UserEntity u) {
		// TODO Auto-generated method stub
		
	}

}
