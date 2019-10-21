package javaee.design_patterns.decorator.jbm;

import java.util.LinkedList;
import java.util.List;

public final class TextField extends GraphicalComponent {
	
	private List<String> lines = new LinkedList<>();

	@Override
	public void paint() {
		System.out.println("Start TextField.paint...");
		for(String l:lines) {
			System.out.println(l);
		}		
		System.out.println("End TextField.paint...");
	}

	@Override
	public GraphicalComponent addContent(Object content) {
		assert(content instanceof String);
		this.lines.add((String) content);
		
		if(this.lines.size() >= 2) {//Business Logic Added Decorator
			//add scroll bar Decorator
			return new ScrollBarDecorator(this);
		}
		return this;
	}

}
