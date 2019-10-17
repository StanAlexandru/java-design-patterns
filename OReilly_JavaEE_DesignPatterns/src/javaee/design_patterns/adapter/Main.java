package javaee.design_patterns.adapter;

public class Main {

	public static void main(String[] args) {

		Logger logger = Logger.create();
		logger.debug("Debug message");
		logger.trace("Trace message");
		logger.error("Error message");

	}

}
