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
	
	/**
	 * Method for returning a list of all plant products
	 * 
	 * @return a List of type PlantModel
	 */
	public List<PlantModel> getPlantList();
	
	/**
	 * Method for adding a PlantModel to the database
	 * 
	 * @param plantModel Plant model instance
	 * @return boolean indicating successful insertion of PlantModel into database
	 */
	public boolean addPlant(PlantModel plantModel);
	
	/**
	 * Method for returning a PlantModel by its id
	 * 
	 * @param id id number for desired PlantModel
	 * @return instance of PlantModel
	 */
	public PlantModel getPlantById(int id);
	
	/**
	 * Method for deleting a PlantModel from the database
	 * 
	 * @param PlantModel instance of PlantModel to be deleted
	 * @return boolean indicating successful deletion of PlantModel from database
	 */
	public boolean deletePlant(PlantModel plantModel);
	
	/**
	 * Method for updating a PlantModel in the database
	 * 
	 * @param coffeeModel PlantModel instance to be updated
	 * @return boolean indication successful update of PlantModel in database
	 */
	public boolean updatePlant(PlantModel plantModel);
	
}
