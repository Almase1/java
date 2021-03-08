package ejercicios3;

import java.util.Scanner;

public class Capicua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         capicua();
	}		
	
	
	
	public static void capicua() {
			Scanner scan = new Scanner(System.in);
			System.out.print("Introduzca la cantidad de numeros que va a insertar: ");
			int cont = scan.nextInt();
			int input[] = new int[cont];
			boolean flag = true;

			for (int i = 0; i < cont; i++) {
				System.out.print("Introduzca número: ");
				input[i] = scan.nextInt();

			}

			//Comprobasr si es capicua
			for (int i = 0; i < cont; i++) {

				if (input[i] != input[cont - 1 - i]) {
					flag = false;
				}

			}

			scan.close();
			System.out.print((flag) ? "La cadena es capicúa " : "La cadena no es capicúa ");

		}

	}


