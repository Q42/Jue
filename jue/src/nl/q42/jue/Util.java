package nl.q42.jue;

import java.io.UnsupportedEncodingException;

class Util {
	private Util() {}
	
	// This is used to check what byte size strings have, because the bridge doesn't natively support UTF-8
	public static int stringSize(String str) {
		try {
			return str.getBytes("utf-8").length;
		} catch (UnsupportedEncodingException e) {
			throw new UnsupportedOperationException("UTF-8 not supported");
		}
	}
}
