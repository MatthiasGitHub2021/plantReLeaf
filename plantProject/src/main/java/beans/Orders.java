package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name = "Orders")
@ViewScoped
public class Orders 
{

	private List<Order> ordersList;


	public List<Order> getOrdersList() {
		ordersList.add(new Order("1", "T-Shirt", 10.00, 15));
		ordersList.add(new Order("2", "Pants", 15.00, 7));
		ordersList.add(new Order("3", "Socks", 10.00, 110));

		
		
		return ordersList;
	}

	public void setOrdersList(List<Order> ordersList) {
		this.ordersList = ordersList;
	}
}