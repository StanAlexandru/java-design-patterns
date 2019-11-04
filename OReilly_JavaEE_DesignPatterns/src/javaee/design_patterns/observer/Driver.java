package javaee.design_patterns.observer;

public class Driver extends Thread {
	
	public static final long UPDATE_RATE_IN_SEC = 5;
	private static final long RANGE_OF_CHANGE = 1000;
	
	public int updateCount = 0;
	private long value = 30000;
	private boolean shutDowm = false;
	
	private Thermometer t;

	public Driver(Thermometer t) {
		super();
		this.t = t;
	}

	@Override
	public void run() {

		try {
			
			while(!this.shutDowm) {
				this.value += (long) (Math.random() * RANGE_OF_CHANGE) - (RANGE_OF_CHANGE / 2);
				this.updateCount++;
				System.out.println(
						"Driver update #"
						+ this.updateCount
						+ ": "
						+ this.value);
				this.t.driverSetTemperature(this.value);
				Thread.sleep(UPDATE_RATE_IN_SEC * 1000);
			}
			
		} catch(Exception e) {
			
		}
	}
	
	public void shutDown() {
		this.shutDowm = true;
	}

}
