package javaee.design_patterns.factory_method;

import java.security.InvalidParameterException;

public interface Shape {

	void draw();
	
	public static Shape create(String shapeAsText) {		
		
		if(shapeAsText.startsWith("#rect")) {
			return new Rectangle();
		} else if(shapeAsText.startsWith("#oval")) {
			return new Oval();
		} else if(shapeAsText.startsWith("#line")) {
			return new Line();
		}
		throw new InvalidParameterException(shapeAsText);
		
	}

}
