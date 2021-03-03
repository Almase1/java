package ejercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Cifras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.ENGLISH);
		System.out.print("Primer número: ");
		double num = entrada.nextDouble();
		int counter = 0;
		
		if(num<0) {
			num = num*(-1);
		}
		
		while(num>1) {
			counter++;
			num = num / 10;
		}
		System.out.println("Número de " + counter + " cifras.");	
		entrada.close();

	}

}
