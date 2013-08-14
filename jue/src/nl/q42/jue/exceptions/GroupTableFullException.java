package nl.q42.jue.exceptions;

@SuppressWarnings("serial")
public class GroupTableFullException extends ApiException {
	public GroupTableFullException() {}
	
	public GroupTableFullException(String message) {
		super(message);
	}
}
