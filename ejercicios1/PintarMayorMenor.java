package ejercicios1;

import java.util.Scanner;

public class PintarMayorMenor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Dime un numero: ");
		Scanner entrada = new Scanner(System.in);
		int num1 = entrada.nextInt();
		int num2 = entrada.nextInt();

		if (num1 > num2) {
			System.out.println(num1 + "-" + num2);
		} else {
			System.out.println(num2 + "-" + num1);
		}
		entrada.close();
	}
}
