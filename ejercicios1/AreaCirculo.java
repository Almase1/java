package ejercicios1;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=10.1;
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.ENGLISH);
		System.out.println("Escribe el radio del círculo:");
		double radio = scan.nextDouble();
		
		double area = (3.1416 * (radio * radio));
		
		
		System.out.println("El área del circulo es: " + area + ".");
		

		
		
		
		
	}

}
