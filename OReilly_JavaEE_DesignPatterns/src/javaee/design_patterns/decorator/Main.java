package javaee.design_patterns.decorator;

public class Main {

	public static void main(String[] args) {

		GraphicalComponent component = constructPoem();
		// Add a border
		//Client Added Decorator
		component = new BorderDecorator(component);
		component.paint();

	}

	private static GraphicalComponent constructPoem() {		
		return new TextField()
				.addContent("Ce-ți doresc eu ție, dulce Românie,")
				.addContent("Țara mea de glorii, țara mea de dor, ")
				.addContent("Brațele nervoase, arma de tărie, ")
				.addContent("La trecutu-ți mare, mare viitor! ");
	}

}
