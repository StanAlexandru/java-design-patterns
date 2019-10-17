package javaee.design_patterns.proxy;

public class BusinessObjectProxy implements BusinessObject {
	
	BusinessObject target;

	public BusinessObjectProxy(BusinessObject target) {
		super();
		this.target = target;
	}

	@Override
	public void sayHi() {
		System.out.println("Proxy does preprocessing");
		System.out.println("Proxy calls real object");
		this.target.sayHi();
		System.out.println("Proxy does postprocessing");
	}

}
