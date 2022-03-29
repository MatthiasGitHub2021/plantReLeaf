package controller;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.UserEntity;

/**
 * Controller for main page
 * @author matth
 *
 */
@SuppressWarnings("deprecation")
@ManagedBean(name="FormController")
@ViewScoped
public class FormController{
	FacesContext fc = FacesContext.getCurrentInstance();
	Map<String, Object> sessionMap = fc.getExternalContext().getSessionMap();
	
//	public String onLogin(){		
//		//if(user.getUserName() != sessionMap.get(user.getUserName()) || user.getPassword() != sessionMap.get(user.getPassword())) {
//			//add jsf message here
//		//}else {
//		return "login.xhtml";
//		//}
//	}
	
	public String onLogoff() {
		// Invalidate the Session to clear the security token
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			
		// Redirect to a protected page (so we get a full HTTP Request) to get Login Page
		return "TestResponse.xhtml?faces-redirect=true";

	}
	
	public String onRegistration(){		
		return "register.xhtml";
 }
	
//	public String onSubmit(User user) {
	public String onSubmit() {
//		sessionMap.put("firstName", user.getFirstName());
//		sessionMap.put("lastName", user.getLastName());
//		sessionMap.put("phoneNum", user.getPhoneNum());
//		sessionMap.put("email", user.getEmail());
//		sessionMap.put("userName", user.getUserName());
//		sessionMap.put("password", user.getPassword());
		
		return "currentEndpoint.xhtml";
	}
	
}