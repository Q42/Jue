package nl.q42.jue;

/**
 * Basic light information
 */
public class Light {
	private String id;
	private String name;
	
	Light() {}
	
	void setId(String id) {
		this.id = id;
	}
	
	/**
	 * Return the ID of the light.
	 * @return id of the light
	 */
	public String getId() {
		return id;
	}
	
	/**
	 * Return the name of the light.
	 * @return name of the light
	 */
	public String getName() {
		return name;
	}
}
