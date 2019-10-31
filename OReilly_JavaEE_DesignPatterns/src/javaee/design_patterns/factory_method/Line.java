package javaee.design_patterns.factory_method;

public class Line implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Line");
	}

}
