package javaee.design_patterns.decorator;

public interface GraphicalComponent {
	
	void paint();
	
	GraphicalComponent addContent(Object content);
	
}
