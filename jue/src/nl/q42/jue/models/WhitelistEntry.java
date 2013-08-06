package nl.q42.jue.models;

import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class WhitelistEntry {
	@SerializedName("last use date")
	public Date lastusedate;
	
	@SerializedName("create date")
	public Date createdate;
	
	@SerializedName("name")
	public String devicetype;
}
