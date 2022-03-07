package controller;

import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@SuppressWarnings("deprecation")
@ManagedBean(name="FormController")
@ViewScoped
public class FormController 
{
	FacesContext fc = FacesContext.getCurrentInstance();
	
	public String onLogin()
	{		
		return "Login.xhtml";
	}
	
	public String onRegistration() 
 {		
		return "register.xhtml";
 }
	
	public String onSubmit(User user) {
		
		Map<String, Object> sessionMap = fc.getExternalContext().getSessionMap();
		
		sessionMap.put("firstName", user.getFirstName());
		sessionMap.put("lastName", user.getLastName());
		sessionMap.put("phoneNum", user.getPhoneNum());
		sessionMap.put("email", user.getEmail());
		sessionMap.put("userName", user.getUserName());
		sessionMap.put("password", user.getPassword());
		
		return "currentEndpoint.xhtml";
	}
	
}