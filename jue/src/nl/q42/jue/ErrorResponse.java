package nl.q42.jue;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.reflect.TypeToken;

class ErrorResponse {
	public final static Type gsonType = new TypeToken<List<SuccessResponse>>(){}.getType();
	
	private int type;
	private String address;
	private String description;
	
	public int getType() {
		return type;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getDescription() {
		return description;
	}
}
