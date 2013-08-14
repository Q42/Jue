package nl.q42.jue.exceptions;

@SuppressWarnings("serial")
public class DeviceOffException extends ApiException {
	public DeviceOffException() {}
	
	public DeviceOffException(String message) {
		super(message);
	}
}
