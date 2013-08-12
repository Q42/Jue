package nl.q42.jue.models;

/**
 * Current state of light
 */
public class State {
	private boolean on;
	private int bri;
	private int hue;
	private int sat;
	private float[] xy;
	private int ct;
	private String colormode;
	private boolean reachable;
	
	/**
	 * Color modes of a light
	 */
	public enum ColorMode {
		/**
		 * CIE color space coordinates
		 */
		XY,
		
		/**
		 * Hue and saturation
		 */
		HS,
		
		/**
		 * Color temperature in mirek
		 */
		CT
	}
	
	/**
	 * Returns the on state.
	 * @return true if the light is on, false if it isn't
	 */
	public boolean isOn() {
		return on;
	}
	
	/**
	 * Returns the brightness.
	 * @return brightness
	 */
	public int getBrightness() {
		return bri;
	}
	
	/**
	 * Returns the hue.
	 * @return hue
	 */
	public int getHue() {
		return hue;
	}
	
	/**
	 * Returns the saturation.
	 * @return saturation
	 */
	public int getSaturation() {
		return sat;
	}
	
	/**
	 * Returns the coordinates in CIE color space.
	 * @return cie color spaces coordinates
	 */
	public float[] getXY() {
		return xy;
	}
	
	/**
	 * Returns the color temperature.
	 * @return color temperature
	 */
	public int getColorTemperature() {
		return ct;
	}
	
	/**
	 * Returns the current color mode.
	 * @return current color mode
	 */
	public ColorMode getColorMode() {
		if (colormode.equals("xy")) {
			return ColorMode.XY;
		} else if (colormode.equals("hs")) {
			return ColorMode.HS;
		} else {
			return ColorMode.CT;
		}
	}
	
	/**
	 * Returns reachability.
	 * @return true if reachable, false if it isn't
	 */
	public boolean isReachable() {
		return reachable;
	}
}
