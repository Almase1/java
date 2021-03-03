package ejercicios1;

import java.util.Scanner;

public class OrdenarTresNumerosArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime un numero: ");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();
		int num3 = entrada.nextInt();

		int aux;
		int[] array = { num1, num2, num3 };

		for (int i = 0; i < array.length - 1; i++) {
			for (int x = i + 1; x < array.length; x++) {
				if (array[x] > array[i]) {
					aux = array[i];
					array[i] = array[x];
					array[x] = aux;
				}
			}
		}

		// Pintar el array
		for (int posicion = 0; posicion < array.length; posicion++) {
			System.out.print(array[posicion] + " ");
		}
		entrada.close();

	}

}
