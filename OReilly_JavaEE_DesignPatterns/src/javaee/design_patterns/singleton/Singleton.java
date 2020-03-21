package javaee.design_patterns.singleton;

//Lazy Singleton
public final class Singleton {
	
	// Single static instance
	private static Singleton INSTANCE;
	
	// No available constructors
	private Singleton() {
		
	}
	
	// Static getter for the single instance
	public static Singleton getInstance() {
		if(INSTANCE == null) {
			// For Multithreading
			synchronized (Singleton.class) {
				if(INSTANCE == null) {
					INSTANCE = new Singleton(); 
				}
			}
		}
		return INSTANCE;
	}
	
	public void m() {
		
	}

}
