package javaee.design_patterns.observer;

public class PollingThermometerClient {
	
	private static final long SEC_TO_RUN = 20;
	private static final long MILLIS_BETWEEN_POLLS = 50;
	
	public static void main(String [] args) throws InterruptedException {
		
		Setup s = new Setup();
		
		Thermometer t = s.getThermometer();
		
		long count = SEC_TO_RUN * 1000 / MILLIS_BETWEEN_POLLS;
		
		for (int i = 0; i < count; i++) {
			
			Thread.sleep(MILLIS_BETWEEN_POLLS);
			
			System.out.println(
					"Checking Temperature #"
					+ i
					+ ": "
					+t.getTemperatureCelsius()
					+ "; "
					+t.getTemperatureKelvin()
					+ "; "
					+t.getTemperatureFahrenheit());
		}
		
		s.shutDown();

	}

}
