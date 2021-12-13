package fr.model;

public class Carte {
	private int id;
	private String type;

	public Carte() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param type
	 */
	public Carte(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Carte [id=" + id + ", type=" + type + "]";
	}
	
	
}
