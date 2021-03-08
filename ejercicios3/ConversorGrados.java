package ejercicios3;

import java.util.Scanner;

public class ConversorGrados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 1) {

			double temperatura = 0;
			try {
				temperatura = Double.parseDouble(args[0]);
				System.out.println(grados(temperatura));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				System.out.println("No es un numero");
			}

		} else
			System.out.println("Argumentos incorrectos");
	}

	public static double grados(double gradosf) {

		double gradosc = (gradosf - 32) * 5 / 9;

		return gradosc;
	}

}
