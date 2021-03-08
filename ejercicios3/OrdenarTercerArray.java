package ejercicios3;

import java.util.Scanner;

public class OrdenarTercerArray {

	public static void main(String[] args) {

		Scanner cont = new Scanner(System.in);

		int array0[], array1[], array2[];

		array0 = new int[5];
		array1 = new int[5];
		array2 = new int[10];

		System.out.println("digite el primer numero: ");
		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "Digite un numero :");
			array0[i] = cont.nextInt();

		}
		System.out.println("ahora 5 numeros mas :");
		for (int i = 0; i < 5; i++) {

			System.out.print((i + 1) + "Dame untros 5 numeros: ");

			array1[i] = cont.nextInt();

		}

		int j = 0;
		for (int i = 0; i < 5; i++) {

			array2[j] = array0[i];
			j++;

			array2[j] = array1[i];
			j++;
		}

		System.out.print("\n El tercer array es:");
		for (int i = 0; i < 10; i++) {
			System.out.print(array2[i] + " ");
		}

	}

}
