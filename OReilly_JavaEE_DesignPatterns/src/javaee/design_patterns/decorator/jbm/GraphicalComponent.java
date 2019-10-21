package javaee.design_patterns.decorator.jbm;

public abstract class GraphicalComponent {
	
	protected abstract void paint();	

	protected abstract GraphicalComponent addContent(Object content);
	
}
