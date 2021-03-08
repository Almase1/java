package ejercicios3;

import java.util.Scanner;

public class OrdenarArray2 {
	public static void main(String[] args) {

		System.out.print("Dame 5 números : ");
		Scanner sc = new Scanner(System.in);

		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		int numero4 = sc.nextInt();
		int numero5 = sc.nextInt();

		int[] arraypunto = new int[5];
		arraypunto[0] = numero1;
		arraypunto[1] = numero2;
		arraypunto[2] = numero3;
		arraypunto[3] = numero4;
		arraypunto[4] = numero5;

		boolean creciente = true;
		for (int i = 0; i < arraypunto.length; i++) {
			if (i + 1 < arraypunto.length) {
				if (arraypunto[i] > arraypunto[i + 1]) {
					creciente = false;
					break;
				}
			}
		}
		boolean decreciente = true;
		if (creciente == false) {
			for (int i = 0; i < arraypunto.length; i++) {
				if (i + 1 < arraypunto.length) {
					if (arraypunto[i] < arraypunto[i + 1]) {
						decreciente = false;
						break;
					}
				}
			}
		}

		if (creciente) {
			System.out.println("La lista está ordenada de forma creciente.");
		} else if (decreciente) {
			System.out.println("La lista está ordenada de forma decreciente.");
		} else {
			System.out.println("La lista NO está ordenada de ninguna forma.");
		}
	}

}
