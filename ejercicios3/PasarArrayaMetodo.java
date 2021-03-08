package ejercicios3;

public class PasarArrayaMetodo {

	public static void main(String[] args) {
		int[] array1 = new int[10];
		for (int x = 0; x < array1.length; x++) {
			array1[x] = (int) (Math.random() * 500) + 1;
			System.out.print(array1[x] + " ");
		}

		System.out.println("\nel mayor es:" + mayor(array1));
	}

	public static int mayor(int numeros[]) {
		int mayor = 0;
		int len = numeros.length;
		for (int i = 0; i < len; i++) {

			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}

		}

		return mayor;
	}

}
