package javaee.design_patterns.decorator;

public abstract class Decorator implements GraphicalComponent{

	private GraphicalComponent nextComponent;

	public Decorator(GraphicalComponent next) {
		super();
		this.nextComponent = next;
	}

	@Override
	public void paint() {
		this.nextComponent.paint();
	}

	@Override
	public GraphicalComponent addContent(Object content) {
		return this;
	}	
	
}
