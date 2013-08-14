package nl.q42.jue.exceptions;

@SuppressWarnings("serial")
public class EntityNotAvailableException extends ApiException {
	public EntityNotAvailableException() {}
	
	public EntityNotAvailableException(String message) {
		super(message);
	}
}
