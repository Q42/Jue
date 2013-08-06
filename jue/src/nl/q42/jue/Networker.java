package nl.q42.jue;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.NoSuchElementException;
import java.util.Scanner;

// TODO: Add timeout parameter and allow this to be set from HueBridge
class Networker {
	public static Result get(String address) throws IOException {
		return doNetwork(address, "GET", "");
	}
	
	public static Result post(String address, String body) throws IOException {
		return doNetwork(address, "POST", body);
	}
	
	public static Result put(String address, String body) throws IOException {
		return doNetwork(address, "PUT", body);
	}
	
	public static Result delete(String address) throws IOException {
		return doNetwork(address, "DELETE", "");
	}
	
	private static Result doNetwork(String address, String requestMethod, String body) throws IOException {
		HttpURLConnection conn = (HttpURLConnection) new URL(address).openConnection();
		try {
			conn.setRequestMethod(requestMethod);
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setConnectTimeout(4 * 1000); // TODO
			//conn.setReadTimeout(timeout) // TODO
			
			if (body != null && !body.equals("")) {
				conn.setDoOutput(true);
				OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream());
				out.write(body);
				out.close();
			}
			
			InputStream in = new BufferedInputStream(conn.getInputStream());
			String output = convertStreamToString(in);
			return new Result(output, conn.getResponseCode());
		} finally {
			conn.disconnect();
		}
	}
	
	private static String convertStreamToString(InputStream is) {
	    try {
	        return new Scanner(is).useDelimiter("\\A").next();
	    } catch (NoSuchElementException e) {
	        return "";
	    }
	}
	
	public static class Result {
		private String body;
		private int responseCode;
		
		public Result(String body, int responseCode) {
			this.body = body;
			this.responseCode = responseCode;
		}
		
		public String getBody() {
			return body;
		}
		
		public int getResponseCode() {
			return responseCode;
		}
	}
}
