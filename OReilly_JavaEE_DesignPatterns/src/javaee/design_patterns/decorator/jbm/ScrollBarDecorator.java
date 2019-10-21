package javaee.design_patterns.decorator.jbm;

public class ScrollBarDecorator extends GraphicalComponentDecorator {
	
	public ScrollBarDecorator(GraphicalComponent decoratedComponent) {
		super(decoratedComponent);
	}

	@Override
	public final void paint() {
		System.out.println("Update decoratedComponent paint method with ScrollBarDecorator logic");
		decoratedComponent.paint();
	}
	
	@Override
	public final GraphicalComponent addContent(Object content) {
		System.out.println("Update decoratedComponent addContent method with ScrollBarDecorator logic");
		return decoratedComponent
				.addContent("Scrollbar -> " + content);
	}

}
