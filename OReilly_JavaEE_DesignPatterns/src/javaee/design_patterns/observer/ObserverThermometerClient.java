package javaee.design_patterns.observer;

public class ObserverThermometerClient implements Observer{

	@Override
	public void update(Observable observable) {
		
		Thermometer t = (Thermometer) observable;
		
		System.out.println(
				"Checking Temperature #"
				+t.getTemperatureCelsius()
				+ "; "
				+t.getTemperatureKelvin()
				+ "; "
				+t.getTemperatureFahrenheit());
	}
	
	public static void main(String [] args) throws InterruptedException {
		
		Setup s = new Setup();
		ObserverThermometerClient client = new ObserverThermometerClient();
		s.getThermometer().addObserver(client);
		
		Thread.sleep(20000);
		
		s.shutDown();
	}

}
