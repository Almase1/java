package ejercicios1;

import java.util.Scanner;

public class NegativoPositivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime un numero: ");
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		if (num >= 0) {
			System.out.println("Es positivo");
		} else {
			System.out.println("Es negativo");

		}

	}

}
