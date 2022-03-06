package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import beans.User;

@ManagedBean(name="FormController")
@ViewScoped
public class FormController 
{
	
	public String onSubmit(User user)
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getExternalContext().getRequestMap().put("User", user);
		
		return "ViewProducts.xhtml";
	}
	
	public String onFlash(User user) 
 {
		FacesContext fc = FacesContext.getCurrentInstance();
		fc.getExternalContext().getFlash().put("User", user);
		
		return "ViewProducts.xhtml";
 }
}