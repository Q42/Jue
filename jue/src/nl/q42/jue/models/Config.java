package nl.q42.jue.models;

import java.util.Date;
import java.util.Map;

/**
 * Basic bridge configuration info.
 */
public class Config {
	// Info available to unauthenticated clients
	private String name;
	private String swversion;
	
	// Info only available to authenticated clients
	private String mac;
	private Boolean dhcp;
	private String ipaddress;
	private String netmask;
	private String gateway;
	
	private String proxyaddress;
	private Integer proxyport;
	
	private Date UTC;
	private Map<String, WhitelistEntry> whitelist;
	private SWUpdate swupdate;
	private Boolean linkbutton;
	private Boolean portalservices;
	
	/**
	 * Returns the name of the bridge.
	 * @return Name of the bridge
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Returns the version of the software on the bridge.
	 * @return Version of software on the bridge
	 */
	public String getSoftwareVersion() {
		return swversion;
	}
	
	/**
	 * Returns the MAC address of the bridge.
	 * Note: Requires user to be authenticated.
	 * @return MAC address of bridge
	 */
	public String getMACAddress() {
		return mac;
	}
}
