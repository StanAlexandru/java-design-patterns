package javaee.design_patterns.decorator.jbm;

public class Main {

	public static void main(String[] args) {

		GraphicalComponent textField4linePoem = construct4linePoem();
		textField4linePoem = new BorderDecorator(textField4linePoem);
		textField4linePoem.paint();
		
		new BorderDecorator(construct1linePoem()).paint();

	}

	private static GraphicalComponent construct4linePoem() {		
		return new TextField()
				.addContent("Ce-ți doresc eu ție, dulce Românie,")
				.addContent("Țara mea de glorii, țara mea de dor, ")
				.addContent("Brațele nervoase, arma de tărie, ")
				.addContent("La trecutu-ți mare, mare viitor! ");
	}
	
	private static GraphicalComponent construct1linePoem() {		
		return new TextField()
				.addContent("Ce-ți doresc eu ție, dulce Românie,");
	}

}
