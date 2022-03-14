package business;

import java.util.List;

import javax.ejb.Local;

import beans.Plant;

@Local
public interface PlantInterface {
	
	//return list of all plant entities
	public List<PlantsList> getPlantList();
	
	//add coffee to db;
	public boolean addCoffee() {
		
	}
	
	//return plant entity by id
	public getPlantByID() {
		
	}
	
	//delete plant
	public boolean deletePlant() {
		
	}
	
	//update plant
	public boolean updatePlant() {
		
	}
	
}
