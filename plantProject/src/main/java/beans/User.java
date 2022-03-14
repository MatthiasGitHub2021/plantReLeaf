package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

//This page is for creating the User entity

@SuppressWarnings("deprecation")
@ManagedBean(name="User")
@ViewScoped
public class User 
{
	
	@NotNull()
	@Size(min=1,max=50)
	String firstName;
	String lastName;
	int phoneNum;
	String email;
	String userName;
	String password;
	
	public User() {
		super();
	}
		
	public User(String firstName, String lastName, int phoneNum, String email, String userName, String password) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.email = email;
		this.userName = userName;
		this.password = password;
		
	}

	//getters/setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

}
