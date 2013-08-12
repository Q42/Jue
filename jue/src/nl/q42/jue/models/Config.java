package nl.q42.jue.models;


/**
 * Basic bridge configuration info.
 */
public class Config {
	private String name;
	private String swversion;
	
	/**
	 * Returns the name.
	 * @return name of the bridge
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the version of the software.
	 * @return version of software on the bridge
	 */
	public String getSoftwareVersion() {
		return swversion;
	}
}
