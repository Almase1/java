package ejerciciosBuclesArrays;

import java.util.Scanner;

public class ContarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);

		int num;
		int cont = 0;
		boolean marcador = true;

		do {
			System.out.println("Dime un numero");

			num = numero.nextInt();

			if (num >= 0) {
				cont++;
			}

			else {
				marcador = false;
			}

		} while (marcador);  //No hace falta poner la condicion
		
		System.out.println("Has introducido " + cont + " numeros");
	}

}
