package beans;

 //This page is for creating the plant entity
 
public class Plant {
	String name;
	String size;
	String description;
	String grown;
	Boolean flowering;
	
	public Plant() {}
	
	public Plant(String name, String size, String description, String grown, Boolean flowering) {
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
