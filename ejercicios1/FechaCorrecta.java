package ejercicios1;

import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Dia");
		int dia = entrada.nextInt();
		System.out.println("Mes");
		int mes = entrada.nextInt();
		System.out.println("Año");
		int anio = entrada.nextInt();
		
		if (mes<1 || mes>12)
		{
			System.out.println("Mes Incorrecto");
			System.exit(10);
		}
		//Meses con 31
		if (mes==1 || mes==3 || mes==5|| mes==7 || mes==8 || mes==10 || mes==12)
		{
			if (dia<1 || dia>31) System.out.println("Dia Incorrecto");
			System.exit(20);
		}
					
		//Meses con 30
		if (mes==1 || mes==4 || mes==6|| mes==11 || mes==9 )
		{
			if (dia<1 || dia>30) System.out.println("Dia Incorrecto");
			System.exit(20);
		}
		
		//Febrero
		if (mes==2) {
			if (dia<1 || dia>28) System.out.println("Dia Incorrecto");
			System.exit(20);
		}
		System.out.println("Fecha Correcta");
	}

}
