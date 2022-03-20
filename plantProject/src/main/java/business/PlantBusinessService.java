package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.Plant;
import beans.PlantEntity;
import models.PlantModel;

//Handles all business logic for actions pertaining to Plant products

@Stateless
@Local(PlantBusinessInterface.class)
@LocalBean
public class PlantBusinessService implements PlantBusinessInterface {

	private PlantDataService service;
	
	@Override
	public List<PlantModel> getPlantList() {
		
		// Retrieve list of plant products from database
		List<PlantEntity> plantProds = service.findAll();
		
		//Create new empty list to hold plant products
		List<PlantModel> plantProducts = new ArrayList<PlantModel>();
		
		for(PlantEntity entity : plantProds) {
			plantProducts.add(new PlantModel(entity.getId(), ))
		}
		return plantProducts;
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

	@Override
	public boolean addPlant(PlantModel plantModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public PlantModel getPlantById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePlant(PlantModel plantModel) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updatePlant(PlantModel plantModel) {
		// TODO Auto-generated method stub
		return false;
	}

}