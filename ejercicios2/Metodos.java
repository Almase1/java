package ejercicios2;

public class Metodos {

	public static int NumMayor(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else {
			return n2;
		}

	}

	public double volumencilindro(int radio, int longitud) {

		double vol = 0;

		vol = Math.PI * Math.pow(radio, 2) * longitud;
		//System.out.println("El volumen es: " + vol);
		return vol;
	}

}
