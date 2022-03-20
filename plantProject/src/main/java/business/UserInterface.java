package business;

import javax.ejb.Local;

import beans.UserEntity;

@Local
public interface UserInterface {
	public void getFirstName(UserEntity u);
	public void getLastName(UserEntity u);
	public void getPhoneNumber(UserEntity u);
	public void getEmail(UserEntity u);
	public void getUserName(UserEntity u);
	public void getPassWord(UserEntity u);


}
