package zyh.test.team.domain;

public class PC implements Equipment {
	
	/*
	 *  model: String
 display: String

	 */
	private String model;
	private String display;
	
	

	public PC(String model, String display) {
		super();
		this.model = model;
		this.display = display;
	}



	@Override
	public String getDescription() {
		return model + "("  + display + ")";
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getDisplay() {
		return display;
	}



	public void setDisplay(String display) {
		this.display = display;
	}

}
