package ejercicios;

import java.util.Scanner;

public class VocalesConMayusculas {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String frase;
		frase = teclado.nextLine();
		//Lo convertimos a Mayusculas
        String frase_mayus=frase.toUpperCase(); 
		
		for (int posicion = 0; posicion < frase.length(); posicion++) {
			// Poner la letra en una variable
			
			char letra = frase_mayus.charAt(posicion);
		
			if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
				continue;
			}
			System.out.print(letra);
		}
		teclado.close();
	}

}