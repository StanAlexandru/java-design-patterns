package javaee.design_patterns.proxy;

public class BusinessObjectImplementation implements BusinessObject {

	/* (non-Javadoc)
	 * @see javaee.design_patterns.proxy.BusinessObject#sayHi()
	 */
	@Override
	public void sayHi() {
		System.out.println("Hello! Have a nice day!");
	}
}
