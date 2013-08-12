package nl.q42.jue.models;

/**
 * Detailed light information
 */
public class FullLight extends Light {
	private State state;
	private String type;
	private String modelid;
	private String swversion;
	
	/**
	 * Returns current state.
	 * @return current state
	 */
	public State getState() {
		return state;
	}
	
	/**
	 * Returns type.
	 * @return type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Returns model ID.
	 * @return model id
	 */
	public String getModelID() {
		return modelid;
	}
	
	/**
	 * Returns software version.
	 * @return software version
	 */
	public String getSoftwareVersion() {
		return swversion;
	}
}
