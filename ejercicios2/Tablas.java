package ejercicios2;

public class Tablas {

	public String saludar(String nombre) {
		return "hola te llamas " + nombre;
	}

	public void media() {

		double array1[] = new double[5];

		// Rellenar el array
		for (int i = 0; i < array1.length; i++) {
			// Meter numeros entre -50 y +50
			array1[i] = (Math.random() * -100) + 50;
			System.out.print(array1[i] + " ");
		}

		// Comprobamos par/impar/Cero
		int ceros = 0, positivos = 0, negativos = 0;
		double sum_positivos = 0, sum_negativos = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] == 0) {
				ceros = ceros++;

			} else if (array1[i] > 0) {
				sum_positivos = sum_positivos + array1[i];
				positivos = ++positivos; //
			} else {
				negativos = ++negativos;
				sum_negativos = sum_negativos + array1[i];
			}
		}

		// operador ternario --> (cond)?verdaero:falso
		System.out.println("\nLa media de los positivos es " + (sum_positivos / ((positivos == 0) ? 1 : positivos))
				+ " y la de los negativos es " + (sum_negativos / ((negativos == 0 ? 1 : negativos))));
		System.out.println("y el numero de ceros es" + ceros);

	}

	public void concatenarTablas() {

		int[] tabla1 = new int[10];
		int[] tabla2 = new int[10];
		int[] tabla3 = new int[20];

		System.out.println("La primera tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla1[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla1[i] + " ");
		}

		System.out.println();
		System.out.println("La segunda tabla es:");

		for (int i = 0; i < tabla1.length; i++) {

			tabla2[i] = (int) (Math.random() * 10) + 1;

			System.out.print(tabla2[i] + " ");
		}

		System.out.println();
		System.out.println("La tercera tabla es:");
		
        int posicion_tabla3=0;
		
        for (int i = 0; i < tabla1.length; i++) {
			tabla3[posicion_tabla3]=tabla1[i];
			tabla3[posicion_tabla3+1]=tabla2[i];
			posicion_tabla3=posicion_tabla3+2;
			//System.out.print(tabla1[i] + " " + tabla2[i] + " ");
		}
        for (int i = 0; i < tabla3.length; i++) {
        	System.out.print(tabla3[i] + " ");
		}
	}

}
