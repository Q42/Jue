package nl.q42.jue.exceptions;

/**
 * Exception thrown when the link button hasn't been pressed
 */
@SuppressWarnings("serial")
public class LinkButtonException extends ApiException {
	public LinkButtonException() {}
	
	public LinkButtonException(String message) {
		super(message);
	}
}
