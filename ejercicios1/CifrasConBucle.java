package ejercicios1;

import java.util.Scanner;

public class CifrasConBucle {
	
	public static void main(String[] args) {
		

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Escribe el número:");
	String cadena = scan.nextLine();
	
	double numero = Double.parseDouble(cadena);
	
	if (numero < 0 || numero > 9999)
	{
		System.out.println("Error.");
	}
	else {
	int longitud = cadena.length();
	int posicion;
	int contador = 0;
	
	for (posicion = 0; posicion < longitud; posicion ++)
	{
		if (cadena.charAt(posicion) != '.')
		{
			contador ++;
		}
	}
	
	System.out.println("El número tiene " + contador + " cifras.");
	
	}
	scan.close();
}	
}
