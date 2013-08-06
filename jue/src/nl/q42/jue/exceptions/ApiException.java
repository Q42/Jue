package nl.q42.jue.exceptions;

@SuppressWarnings("serial")
public class ApiException extends Exception {
	public ApiException() {}
	
	public ApiException(String message) {
		super(message);
	}
}