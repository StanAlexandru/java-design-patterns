package javaee.design_patterns.decorator;

import java.util.LinkedList;
import java.util.List;

public class TextField implements GraphicalComponent {
	
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
		//System.out.println("Start TextField.addContent(" + content + ")...");
		assert(content instanceof String);
		this.lines.add((String) content);
		//System.out.println("End TextField.addContent(" + content + ")...");
		
		if(this.lines.size() >= 2) {//Business Logic Added Decorator
			//add scroll bar Decorator
			return new ScrollBarDecorator(this);
		}
		return this;
	}

}
