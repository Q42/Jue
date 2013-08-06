package nl.q42.jue.exceptions;

@SuppressWarnings("serial")
public class UnauthorizedException extends ApiException {
	public UnauthorizedException() {}
	
	public UnauthorizedException(String message) {
		super(message);
	}
}
