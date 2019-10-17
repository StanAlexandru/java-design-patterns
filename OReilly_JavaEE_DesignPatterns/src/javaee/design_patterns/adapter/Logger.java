package javaee.design_patterns.adapter;

public interface Logger {
	
	void debug(String message);
	void trace(String message);
	void error(String message);

	public static Logger create() {
		return new ApacheCommonsSimpleLogAdapter();
	}
}
