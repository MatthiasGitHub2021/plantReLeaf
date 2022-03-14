package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

//holds the plantList

@SuppressWarnings("deprecation")
@ManagedBean(name = "Orders")
@ViewScoped
public class Plants {
	List<Plant> plantList = new ArrayList<Plant>();
	
	public List<Plant> getPlantList(Plant p) {
		return plantList;
	 
	}
	
	public void add(Plant p) {
		plantList.add(p);
	}
	
	public void delete(Plant p) {
		//plantList.delete(p);
	}
	
}
