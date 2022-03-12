package business;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import beans.Plant;

@Stateless
@Local(PlantInterface.class)
@LocalBean
public class PlantService implements PlantInterface {

	//make test plant hashmap or arraylist
	//this page needs lots, addPlant, deletePlant etc...
	
	
	@Override
	public void getName(Plant p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getSize(Plant p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDescription(Plant p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getGrown(Plant p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean getFlowering() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
