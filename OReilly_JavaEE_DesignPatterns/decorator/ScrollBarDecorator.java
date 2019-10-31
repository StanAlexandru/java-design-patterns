package javaee.design_patterns.decorator;

public class ScrollBarDecorator extends Decorator implements GraphicalComponent {

	public ScrollBarDecorator(GraphicalComponent next) {
		super(next);
	}

	@Override
	public void paint() {
		System.out.println("Start ScrollBarDecorator.paint...");
		super.paint();
	}

}
