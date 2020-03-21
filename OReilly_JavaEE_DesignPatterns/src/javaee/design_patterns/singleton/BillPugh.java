package javaee.design_patterns.singleton;

//Eager Singleton
public final class BillPugh {
	
	private static final class Holder{
		static BillPugh SINGLETON = new BillPugh();
	}
	
	private BillPugh() {
		
	}
	
	public static BillPugh getInstance() {
		return Holder.SINGLETON;
	}
	
	public void m() {
		
	}

}
