package ejercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.print("Primer número: ");
		int n = entrada.nextInt();
		
		switch(n) {
		case 0:
		case 1:
		case 3:
		case 4:
			System.out.println("Suspenso");
			break;
		case 5:
			System.out.println("Sufi");
			break;
		case 6:
			System.out.println("Bien");
		   break;
		case 7:
		case 8:
			System.out.println("Notable");	
			break;
		default:
			System.out.println("Sobere");
		   
}
		
	}

}
