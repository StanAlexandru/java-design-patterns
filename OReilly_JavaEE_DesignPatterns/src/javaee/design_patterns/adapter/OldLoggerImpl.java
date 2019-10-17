package javaee.design_patterns.adapter;

public class OldLoggerImpl implements Logger {

	@Override
	public void debug(String message) {
		System.out.println("DEBUG: " + message);
	}

	@Override
	public void trace(String message) {
		System.out.println("TRACE: " + message);
	}

	@Override
	public void error(String message) {
		System.out.println("ERROR: " + message);
	}

}
