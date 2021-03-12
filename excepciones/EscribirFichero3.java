package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class EscribirFichero3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del fichero:");
		String fichero = teclado.next();
		String linea;
		int contador=0;
		
		try {
			// Abrir fichero para lectura
			FileWriter fw = new FileWriter(fichero);
			PrintWriter pw1 = new PrintWriter(fichero); // --> System.out.println
		
			boolean salir = true;
			

			do {
				//Pedimos una linea por teclado
				System.out.println("Introduce una linea:");
				linea = teclado.nextLine();
				
				//Si he pulsado intro (null) me salgo
				if (linea.equals("F")) {
					salir = false;
				} else if (linea.length() < 4) {
					// no lo guardo en el fichero
				} else {
					// Escribo en fichero
					pw1.println(linea);
					contador=contador+1;
				}
			} while (salir);
			fw.close();
		} catch (IOException e) {
			System.out.println("No puedo abrrir el fichero para escribir, intentalo de nuevo");
		}
		
		System.out.println("Fichero cerrado");
		System.out.println("Has grabado "+contador+" lineas");
		

	}

}
