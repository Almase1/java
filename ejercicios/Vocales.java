package ejercicios;

import java.util.Scanner;

public class Vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Pedir un texto por  pantala
		//Pintar solo las consonantes
		//Esto es una prueba --> st s n prb
		
		String cadena= new String();
				
		Scanner teclado= new Scanner(System.in) ;
		String frase;
		frase= teclado.nextLine();
		
		for (int posicion=0;posicion<frase.length();posicion++) {
			if (frase.charAt(posicion) =='a' ||frase.charAt(posicion)=='e'  ||frase.charAt(posicion)=='i' ||frase.charAt(posicion)=='o' ||frase.charAt(posicion)=='u')
			{
				continue;
			}
			System.out.print(frase.charAt(posicion));
		}
		
		
		
	}

}
