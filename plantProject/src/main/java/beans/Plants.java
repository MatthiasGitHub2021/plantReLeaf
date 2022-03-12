package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name = "Orders")
@ViewScoped
public class Plants {
	List<Plant> plantList = new ArrayList<Plant>();
	
	public List<Plant> getPlantList(Plant p) {
	 plantList.add(new Plant("Name", "Size", "Desc", "Where Grown", false));
	//add couple more plant tests
	 return plantList;
	 
	}
	
	public void setPlantList(List<Plant> plantList) {
		this.plantList = plantList;
	}
	
}
