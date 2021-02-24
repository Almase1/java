package arrays;

import java.util.Scanner;

public class ClaseArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] frases = new String[5];
		

		Scanner entrada = new Scanner(System.in);

		//Pedir las tres frases por teclado
		for (int posicion = 0; posicion <= 2; posicion++) {
			frases[posicion] = entrada.nextLine();
		}
		
		//Imprimirlas
		for (int posicion = 0; posicion <= 2; posicion++) {
			System.out.println(frases[posicion]);
		}

		entrada.close();
	}

}
