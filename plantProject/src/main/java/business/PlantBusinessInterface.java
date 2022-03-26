package business;

import java.util.List;

import javax.ejb.Local;

import beans.PlantEntity;
import models.PlantModel;

/**
 * Interface providing business service methods to interface with Plant data
 * @author Matthias
 *
 */
@Local
public interface PlantBusinessInterface {
	
	//method to return list of all plant entities
	public List<PlantModel> getPlantList();
	
	//method for adding a PlantModel to the database;
	public boolean addPlant(PlantModel plantModel);
	
	//return plant entity by id
	public PlantModel getPlantById(int id);
	
	//delete plant
	public boolean deletePlant(PlantModel plantModel);
	
	//update plant
	public boolean updatePlant(PlantModel plantModel);

	public void getPlants();
	
}
