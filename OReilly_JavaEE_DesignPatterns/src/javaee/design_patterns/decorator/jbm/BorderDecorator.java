package javaee.design_patterns.decorator.jbm;

public class BorderDecorator extends GraphicalComponentDecorator {

	public BorderDecorator(GraphicalComponent decoratedComponent) {
		super(decoratedComponent);
	}

	@Override
	public final void paint() {
		System.out.println("Update decoratedComponent paint method with BorderDecorator	 logic");
		super.paint();
	}

}
