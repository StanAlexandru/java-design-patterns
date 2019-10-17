package javaee.design_patterns.proxy;

public class Main {

	public static void main(String[] args) {

		BusinessObject obj = BusinessObject.create();
		obj.sayHi();
		
	}

}
