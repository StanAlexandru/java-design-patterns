package javaee.design_patterns.observer;

public class Thermometer extends Observable{
	
	private static final String KELVIN_FORMAT = "%,.1fK";
	private static final String CELSIUS_FORMAT = "%,.1fC";
	private static final String FAHRENHEIT_FORMAT = "%,.1fF";

	private double temperatureInKelvin = -1.0;

	public String getTemperatureKelvin() {
		return String.format(KELVIN_FORMAT, temperatureInKelvin);
	}
	
	public String getTemperatureCelsius() {
		return String.format(CELSIUS_FORMAT, temperatureInKelvin - 273.15);
	}
	
	public String getTemperatureFahrenheit() {
		return String.format(FAHRENHEIT_FORMAT, temperatureInKelvin - 273.15);
	}
	
	//Callback Method
	protected void driverSetTemperature(long value) {
		temperatureInKelvin = value/100.0;
		
		notifyObservers();
	}
}
