package business;

import javax.ejb.Local;

import beans.Plant;

@Local
public interface PlantInterface {
	public void getName(Plant p);
	public void getSize(Plant p);
	public void getDescription(Plant p);
	public void getGrown(Plant p);
	public Boolean getFlowering();
	
}
