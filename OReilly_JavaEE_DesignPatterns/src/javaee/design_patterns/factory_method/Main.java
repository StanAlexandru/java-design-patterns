package javaee.design_patterns.factory_method;

public class Main {

	public static void main(String[] args) {
		
		String [] shapes = {
			"#rect 1,2,100,200",
			"#oval 1,1,100,100",
			"#line 0,0,0,0",
			"#rect 2,3,100,200"
		};

		Client c = new Client();
		c.readShapes(shapes);
		c.drawAllShapes();
		
	}

}
