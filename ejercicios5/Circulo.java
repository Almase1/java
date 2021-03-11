package ejercicios5;

public class Circulo extends Figura {
	
	public Circulo(double x) {
		super(x);
	}

	@Override
	public void pintar() {
		System.out.println("No soy capaz de pintar el circulo");
		
	}
	
	@Override
	public String area() {
		
		return "El area es: " + (3.1416 * (getX() * getX()));
	}

	
	
	
}
