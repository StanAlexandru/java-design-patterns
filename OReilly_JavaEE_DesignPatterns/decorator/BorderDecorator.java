package javaee.design_patterns.decorator;

public class BorderDecorator extends Decorator {

	public BorderDecorator(GraphicalComponent next) {
		super(next);
	}

	@Override
	public void paint() {
		System.out.println();
		System.out.println("!!!!!");
		System.out.println("MUST CALL super.paint() TO CALL Decorator's paint METHOD.");
		System.out.println("AND THEN Decorator's paint METHOD CALLS THE paint METHOD OF THE CONSTRUCTOR'S ARGUMENT GraphicalComponent.");
		System.out.println("!!!!!"); 
		System.out.println();
		
		System.out.println("Can try to render border here...");
		super.paint();
		System.out.println("Or border is rendered probably here.");
	}

}
