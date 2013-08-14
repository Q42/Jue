package nl.q42.jue;

import java.util.Date;


/**
 * Detailed bridge info available if authenticated.
 */
public class AuthenticatedConfig extends Config {
	private String mac;
	private boolean dhcp;
	private String ipaddress;
	private String netmask;
	private String gateway;
	private String proxyaddress;
	private int proxyport;
	private Date UTC;
	private boolean linkbutton;
	
	AuthenticatedConfig() {}
	
	/**
	 * Returns the MAC address.
	 * Note: Requires user to be authenticated.
	 * @return mac address of bridge
	 */
	public String getMACAddress() {
		return mac;
	}
	
	/**
	 * Returns if the current IP address was obtained with DHCP.
	 * @return true if the current IP address was obtained with DHCP, false otherwise.
	 */
	public boolean isDHCPEnabled() {
		return dhcp;
	}
	
	/**
	 * Returns the IP address.
	 * Note: Requires user to be authenticated.
	 * @return ip address of bridge
	 */
	public String getIPAddress() {
		return ipaddress;
	}
	
	/**
	 * Returns the network mask.
	 * @return network mask
	 */
	public String getNetworkMask() {
		return netmask;
	}
	
	/**
	 * Returns the IP address of the gateway. 
	 * @return ip address of gateway
	 */
	public String getGateway() {
		return gateway;
	}
	
	/**
	 * Returns the IP address of the proxy or null if there is none.
	 * @return ip address of proxy or null
	 */
	public String getProxyAddress() {
		return proxyaddress.equals("none") ? null : proxyaddress;
	}
	
	/**
	 * Returns the port of the proxy or null if there is none.
	 * @return port of proxy or null
	 */
	public Integer getProxyPort() {
		return proxyaddress.equals("none") ? null : proxyport;
	}
	
	/**
	 * Returns the time on the bridge.
	 * @return time on the bridge
	 */
	public Date getUTCTime() {
		return UTC;
	}
	
	/**
	 * Returns if the link button has been pressed within the last 30 seconds.
	 * @return true if the link button has been pressed within the last 30 seconds, false otherwise
	 */
	public boolean isLinkButtonPressed() {
		return linkbutton;
	}
}
