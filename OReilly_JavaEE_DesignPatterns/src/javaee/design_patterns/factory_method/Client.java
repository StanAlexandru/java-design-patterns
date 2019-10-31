package javaee.design_patterns.factory_method;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private List<Shape> shapes;

	public Client() {
		super();
		this.shapes = new ArrayList<>();
	}

	public void readShapes(String[] shapesAsText) {

		for(String shapeAsText: shapesAsText) {
			shapes.add(Shape.create(shapeAsText));
		}
		
	}

	public void drawAllShapes() {
		shapes.forEach(s -> s.draw());		
	}

}
