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
	
	public ConfigUpdate setProxyPort(int port) {
		if (port < 0) {
			throw new IllegalArgumentException("Invalid value for port");
		}
		
		commands.add(new Command("proxyport", port));
		return this;
	}
	
	public ConfigUpdate setName(String name) {
		if (Util.stringSize(name) < 4 || Util.stringSize(name) > 16) {
			throw new IllegalArgumentException("Bridge name must be between 4 and 16 characters long");
		}
		
		commands.add(new Command("name", name));
		return this;
	}
	
	public ConfigUpdate setProxyAddress(String ip) {
		if (Util.stringSize(ip) > 40) {
			throw new IllegalArgumentException("Bridge proxy address can be at most 40 characters long");
		}
		
		commands.add(new Command("proxyaddress", ip));
		return this;
	}
	
	public ConfigUpdate setLinkButton(boolean pressed) {
		commands.add(new Command("linkbutton", pressed));
		return this;
	}
	
	public ConfigUpdate setIPAddress(String ip) {
		commands.add(new Command("ipaddress", ip));
		return this;
	}
	
	public ConfigUpdate setNetworkMask(String netmask) {
		commands.add(new Command("netmask", netmask));
		return this;
	}
	
	public ConfigUpdate setGateway(String ip) {
		commands.add(new Command("gateway", ip));
		return this;
	}
	
	public ConfigUpdate setDHCP(boolean enabled) {
		commands.add(new Command("dhcp", enabled));
		return this;
	}
}
