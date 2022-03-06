package controller;

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
	
	public String onRegistration(User user) 
 {
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getExternalContext().getFlash().put("User", user);
		
		return "registration.xhtml";
 }
}