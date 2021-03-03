package ejercicios1;

import java.util.Scanner;

public class NotaSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿Cuál es tu nota?");
		Scanner entrada = new Scanner(System.in);

		int nota = entrada.nextInt();
		String calificacionString = "";

		switch (nota) {

		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			calificacionString = "insuficiente";
			break;
		case 5:
			calificacionString = "suficiente";
			break;
		case 6:
			calificacionString = "bien";
			break;
		case 7:
		case 8:
			calificacionString = "notable";
			break;
		case 9:
		case 10:
			calificacionString = "sobresaliente";
			break;

		}

		System.out.println(calificacionString);

		entrada.close();

	}

}
