package javaee.design_patterns.observer;

public class Setup {

	private Driver driver;
	private Thermometer thermometer;
	
	public Setup() {
		this.thermometer = new Thermometer();
		this.driver = new Driver(thermometer);
		this.driver.start();
	}
	
	public void shutDown() {
		this.driver.shutDown();
	}

	public Thermometer getThermometer() {
		return thermometer;
	}
	
}
