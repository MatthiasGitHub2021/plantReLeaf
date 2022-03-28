package business;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import beans.Plants;

/**
 * Service provides REST mapping for plant objects
 * @author matth
 *
 */
@RequestScoped
@Path("/orders")
public class OrdersRestService {
	
	List<Plants> order = new ArrayList<Plants>();
	
	@Inject
	PlantBusinessInterface service;

	/**
	 * Method for returning a plant product in JSON
	 * 
	 * 
	 * @return ResponseEntity contains requested data
	 */
	@GET
	@Path("/getjson")
	@Produces(MediaType.APPLICATION_JSON)
	public Object getOrdersAsJson() {
		service.getPlantList();
		return order;
	}
	
	/**
	 * Method for returning a plant product in XML
	 * 
	 * 
	 * @return ResponseEntity contains requested data
	 */
	@GET
	@Path("getxml")
	@Produces(MediaType.APPLICATION_XML)
	List<Plants> getOrdersAsXml(){
		service.getPlantList();
		
		return order;
	}

}
