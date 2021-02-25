package ejercicios;

import java.util.Scanner;

public class Astericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// pintar tanto stericos como longitud tenga el nombree
		// alberto --> tu nombre mide 7 --> *******
		Scanner entrada = new Scanner(System.in);
		String frase;
		frase = entrada.nextLine();
		String caracter=entrada.next();
		
		//averiguar longitud
		
		int longitud = frase.length();
		System.out.println("la cadena mide " + longitud);
		
		//Pintar asteriscos
		for (int i = 0; i < longitud; i++) {
			System.out.print(caracter);
		}

	}

}
