package controller;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.UserEntity;

@SuppressWarnings("deprecation")
@ManagedBean(name="FormController")
@ViewScoped
public class FormController{
	FacesContext fc = FacesContext.getCurrentInstance();
	Map<String, Object> sessionMap = fc.getExternalContext().getSessionMap();
	
	public String onLogin(){		
		//if(user.getUserName() != sessionMap.get(user.getUserName()) || user.getPassword() != sessionMap.get(user.getPassword())) {
			//add jsf message here
		//}else {
		return "login.xhtml";
		//}
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