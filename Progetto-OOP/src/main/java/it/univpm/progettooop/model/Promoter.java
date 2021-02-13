package it.univpm.progettooop.model;





public class Promoter {

	private String id;

	private String name;
	
	private String description;
	
	public Promoter(String i, String n, String d) {
		this.id=i;
		this.name=n;
		this.description=d;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
