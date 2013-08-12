package nl.q42.jue.exceptions;

/**
 * Exception thrown when the user is unauthorized
 */
@SuppressWarnings("serial")
public class UnauthorizedException extends ApiException {
	public UnauthorizedException() {}
	
	public UnauthorizedException(String message) {
		super(message);
	}
}
