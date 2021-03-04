package ejerciciosBuclesArrays;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num;
		//Calcular el numero
		int x = (int) ((Math.random() * 100 - 1) + 1);
		
		//Variables booleanas para controlar el bucle
		boolean check = false;

		while (!check) {     //while check==false)
			
			//pedir el nuero
			System.out.print("Número: ");
			num = sc.nextInt();
			if (x != num) {
				if (num < x) {
					System.out.println("Más");
				} else {
					System.out.println("Menos");
				}
			} else {
				System.out.println("Acertaste!!");
				System.out.println("El número era el " + x);
				check = true;
			}
		}
		sc.close();

	}

}
