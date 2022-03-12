package business;

import javax.ejb.Local;

import beans.User;

@Local
public interface UserInterface {
	public void getFirstName(User u);
	public void getLastName(User u);
	public void getPhoneNumber(User u);
	public void getEmail(User u);
	public void getUserName(User u);
	public void getPassWord(User u);





	

}
