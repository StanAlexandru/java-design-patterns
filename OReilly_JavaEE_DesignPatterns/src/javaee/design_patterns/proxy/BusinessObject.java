package javaee.design_patterns.proxy;

public interface BusinessObject {

	void sayHi();
	
	/** Factory method pattern introduces a the proxy 
	 * The client has no dependency to the Real or the proxy implementation. */
	public static BusinessObject create() {
		return new BusinessObjectProxy(
				new BusinessObjectImplementation());
	}

}