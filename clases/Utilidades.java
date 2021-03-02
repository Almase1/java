package clases;

public class Utilidades {

	// Par-Impar -- > boolean
	// Numero Primo --> Boolean

	public  static boolean numeroPrimo(double n1) {
		// Comprobar que es divisible por dos
		if (n1 % 2 == 0) {
			return false;
		} else {
			// Contador
			int x = 2;

			// Comprobar si es primo
			while (x < n1) {
				if (n1 % x == 0) {
					// System.out.println("Divisible por:" + x);
					return false;
				}
				x++;
			}
			return true;
		}

	}

	public static boolean parImpar(double n1) {
		if (n1 % 2 == 0) {
			return true;
		} else {
			return false;
		}

}
}
