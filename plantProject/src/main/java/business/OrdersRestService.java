package business;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import beans.Plants;

@RequestScoped
@Path("/orders")
public class OrdersRestService {
	
	@Inject
	PlantBusinessInterface service;

	
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public Object getOrdersAsJson() {
		service.getPlants();
		return List<Order>;
	}
	
	@GET
	@Path("getxml")
	@Produces(MediaType.APPLICATION_XML)
	Class<Plants[]> getOrdersAsXml(){
		service.getPlants();
		
		return Plants[];
	}

}
