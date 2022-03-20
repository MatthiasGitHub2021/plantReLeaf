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
	List<PlantEntity> plantList = new ArrayList<PlantEntity>();
	
	public List<PlantEntity> getPlantList(PlantEntity p) {
		return plantList;
	 
	}
	
	public void add(PlantEntity p) {
		plantList.add(p);
	}
	
	public void delete(PlantEntity p) {
		//plantList.delete(p);
	}
	
}
