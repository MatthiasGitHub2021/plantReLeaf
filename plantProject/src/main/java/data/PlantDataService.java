package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import beans.PlantEntity;

/**
 * Service for handling plant database actions
 * @author Matthias
 *
 */

public class PlantDataService implements DataAccessInterface<PlantEntity>{
	
	
	 PlantRepository plantRepository;
	
	public PlantDataService(PlantRepository plantRepository) {
		this.plantRepository = plantRepository;
	}
	
	
	public List<PlantEntity> findAll(){
		
		//List to hold plant entities returned from database
		List<PlantEntity> plant = new ArrayList<PlantEntity>();
		
		try {
			// Create Iterable Object of PlantEntity from database query
						Iterable<PlantEntity> PlantIterable = plantRepository.findAll();

						// For each item in Iterable Object, add to List of PlantEntity
						PlantIterable.forEach(plant::add);
					} 
					catch (Exception e) {
						e.printStackTrace();
					}

					// Return List of PlantEntities
					return plant;
		
	}


	public PlantEntity findById(int id) {
	
		// Optional Object to hold CoffeeEntity returned from database by id
		Optional<PlantEntity> plant = plantRepository.findById((long) id);
	
		// If Optional Object not null, return CoffeeEntity, else throw NoSuchElement Exception
		return plant.get();
	}

	public boolean create(PlantEntity plant) {

		try	{
			// Attempt to save new PlantEntity to database
			plantRepository.save(plant);
		}catch (Exception e){
			e.printStackTrace();
			return false;
		}

		return true;
	}

	public boolean update(PlantEntity plant) {

		try{
			// Attempt to update PlantModel in database
			plantRepository.save(plant);
		}catch(Exception e)	{
			e.printStackTrace();
			return false;
		}			
		return true;
	}

	public boolean delete(PlantEntity plant) {
	
		try{ 
			// Attempt to delete PlantModel in database
			plantRepository.delete(plant);
		}catch(Exception e)	{
			e.printStackTrace();
			return false;
		}	
		return true;
	}


	@Override
	public PlantEntity findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
