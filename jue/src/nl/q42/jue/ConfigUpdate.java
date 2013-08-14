package nl.q42.jue;

import java.util.ArrayList;

public class ConfigUpdate {
	private ArrayList<Command> commands = new ArrayList<Command>();
	
	String toJson() {
		StringBuilder json = new StringBuilder("{");
		
		for (int i = 0; i < commands.size(); i++) {
			json.append(commands.get(i).toJson());
			if (i < commands.size() - 1) json.append(",");
		}
		
		json.append("}");
		
		return json.toString();
	}
	
	/**
	 * Set the port of the proxy or 0 if there is no proxy.
	 * @param port port for proxy
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setProxyPort(int port) {
		if (port < 0) {
			throw new IllegalArgumentException("Invalid value for port");
		}
		
		commands.add(new Command("proxyport", port));
		return this;
	}
	
	/**
	 * Set the name of the bridge, which also functions as the UPnP name.
	 * @param name new name [4..16]
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setName(String name) {
		if (Util.stringSize(name) < 4 || Util.stringSize(name) > 16) {
			throw new IllegalArgumentException("Bridge name must be between 4 and 16 characters long");
		}
		
		commands.add(new Command("name", name));
		return this;
	}
	
	/**
	 * Set the address of the proxy or "none" if there is no proxy.
	 * @param ip ip of proxy
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setProxyAddress(String ip) {
		if (Util.stringSize(ip) > 40) {
			throw new IllegalArgumentException("Bridge proxy address can be at most 40 characters long");
		}
		
		commands.add(new Command("proxyaddress", ip));
		return this;
	}
	
	/**
	 * Set whether the link button has been pressed within the last 30 seconds or not.
	 * @param pressed true for pressed, false for not pressed
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setLinkButton(boolean pressed) {
		commands.add(new Command("linkbutton", pressed));
		return this;
	}
	
	/**
	 * Set the IP address of the bridge.
	 * @param ip ip address of bridge
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setIPAddress(String ip) {
		commands.add(new Command("ipaddress", ip));
		return this;
	}
	
	/**
	 * Set the network mask of the bridge.
	 * @param netmask network mask
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setNetworkMask(String netmask) {
		commands.add(new Command("netmask", netmask));
		return this;
	}
	
	/**
	 * Set the gateway address of the bridge.
	 * @param ip gateway address
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setGateway(String ip) {
		commands.add(new Command("gateway", ip));
		return this;
	}
	
	/**
	 * Set whether the bridge uses DHCP to get an ip address or not.
	 * @param enabled dhcp enabled
	 * @return this object for chaining calls
	 */
	public ConfigUpdate setDHCP(boolean enabled) {
		commands.add(new Command("dhcp", enabled));
		return this;
	}
}
