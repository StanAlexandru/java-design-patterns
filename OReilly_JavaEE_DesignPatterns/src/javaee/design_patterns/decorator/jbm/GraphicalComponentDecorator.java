package javaee.design_patterns.decorator.jbm;

public abstract class GraphicalComponentDecorator extends GraphicalComponent{

	protected GraphicalComponent decoratedComponent;
	
	public GraphicalComponentDecorator(GraphicalComponent decoratedComponent) {
		this.decoratedComponent = decoratedComponent;
	}

	/**
	 * Paint the decorated object. 
	 */
	@Override
	protected void paint() {
		decoratedComponent.paint();
	}
	
	/**
	 * Return the decorated object with the added content. 
	 */
	@Override
	protected GraphicalComponent addContent(Object content) {
		return decoratedComponent.addContent(content);
	}	

}
