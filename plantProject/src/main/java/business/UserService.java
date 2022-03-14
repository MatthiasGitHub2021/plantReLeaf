package business;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.User;

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
	public void getFirstName(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getLastName(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPhoneNumber(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getEmail(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getUserName(User u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getPassWord(User u) {
		// TODO Auto-generated method stub
		
	}

}
