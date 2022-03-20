package models;

import javax.validation.constraints.Size;

/**
 * Model for Plant product
 * @author Matthias
 *
 */
public class PlantModel {

	@Size(min=1, max = 25, message="Fields must be between 1 and 25.")
	private String name;
	private String size;
	private String description;
	private String grown;
	private Boolean flowering;
	
	public PlantModel() {}
	
	public PlantModel(String name, String size, String description, String grown, Boolean flowering) {
		super();
		this.name = name;
		this.size = size;
		this.description = description;
		this.grown = grown;
		this.flowering = flowering;
	}
	
	//getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGrown() {
		return grown;
	}

	public void setGrown(String grown) {
		this.grown = grown;
	}

	public Boolean getFlowering() {
		return flowering;
	}

	public void setFlowering(Boolean flowering) {
		this.flowering = flowering;
	}

}
