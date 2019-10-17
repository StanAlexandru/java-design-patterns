package javaee.design_patterns.adapter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.SimpleLog;

public class ApacheCommonsSimpleLogAdapter implements Logger {
	
	private Log logger;

	public ApacheCommonsSimpleLogAdapter() {
		super();
		this.logger = new SimpleLog(this.getClass().getCanonicalName());
		((SimpleLog) this.logger).setLevel(SimpleLog.LOG_LEVEL_TRACE);
	}

	@Override
	public void debug(String message) {
		logger.debug(message);
	}

	@Override
	public void trace(String message) {
		logger.trace(message);
	}

	@Override
	public void error(String message) {
		logger.error(message);
	}

}
