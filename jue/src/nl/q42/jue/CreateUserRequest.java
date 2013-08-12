package nl.q42.jue;

class CreateUserRequest {
	public String username;
	public String devicetype;
	
	public CreateUserRequest(String username, String devicetype) {
		if (devicetype.length() > 40) {
			throw new IllegalArgumentException("Device type can be at most 40 characters long");
		}
		
		if (username.length() < 10 || username.length() > 40) {
			throw new IllegalArgumentException("Username must be between 10 and 40 characters long");
		}
		
		this.username = username;
		this.devicetype = devicetype;
	}
	
	public CreateUserRequest(String devicetype) {
		if (devicetype.length() > 40) {
			throw new IllegalArgumentException("Device type can be at most 40 characters long");
		}
		
		this.devicetype = devicetype;
	}
}
