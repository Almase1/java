package ejercicios1;

import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dia");
		int dia = entrada.nextInt();
		System.out.println("Mes");
		int mes = entrada.nextInt();
		System.out.println("Año");
		int anio = entrada.nextInt();
		
		if (dia<1 || dia>30) System.out.println("Dia Incorrecto");
		if (mes<1 || mes>12) System.out.println("Mes Incorrecto");

		if (  (dia<1 || dia>30) || (mes<1 || mes>12)) System.out.println("Fecha incorrecta");
	}

}
