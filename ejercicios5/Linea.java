package ejercicios5;

public class Linea extends Figura {

	Linea(double x) {
		super(x);
		// TODO Auto-generated constructor stub
	}

	@Override
	String area() {
		// TODO Auto-generated method stub
		return "Sin area";
	}

	@Override
	void pintar() {
		// TODO Auto-generated method stub
		for(int i=0; i<getX(); i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}


}
