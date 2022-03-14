package business;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.Plant;

//Handles all business logic for actions pertaining to Plant products

@Stateless
@Local(PlantInterface.class)
@LocalBean
public class PlantService implements PlantInterface {

	
	
	@Override
	public List<PlantsList> getPlantList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addPlant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void getPlantByID() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deletePlant() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePlant() {
		// TODO Auto-generated method stub
		return false;
	}

}