package nl.q42.jue;

@SuppressWarnings("unused")
class SetLightNameRequest {
	private String name;
	
	public SetLightNameRequest(String name) {
		if (Util.stringSize(name) > 32) {
			throw new IllegalArgumentException("Light name can be at most 32 characters long");
		}
		
		this.name = name;
	}
}
