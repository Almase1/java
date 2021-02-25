package ejercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Pedir por teclado 3 datos
		// 2 numeros
		// una operacion (+ - / *)
		// Switch
		// calculo + suma - resta ---
		// Comprobar que ponemos la operacion
		// Bucle hasta que pulsemos una "F" en operacion
		Scanner entrada = new Scanner(System.in);
		String operacion;

		do {
			operacion = entrada.next();
			if (operacion.equals("F")) {
				System.out.println("Fin de programa");
				break;
			}
			// Controlar la operacion
			else if (!operacion.equals("+") && !operacion.equals("-") && !operacion.equals("/")
					&& !operacion.equals("*")) {
				System.out.println("Operacion Incorrecta");
			} else {
				float num1 = entrada.nextFloat();
				float num2 = entrada.nextFloat();
				// float resultado=0;
				switch (operacion) {
				case "+":
					// resultado=num1 + num2;
					System.out.println("Suma:" + (num1 + num2));
					break;
				case "-":
					System.out.println("Resta:" + (num1 - num2));
					break;
				case "/":
					System.out.println("Division:" + (num1 / num2));
					break;
				case "*":
					System.out.println("Multiplicacion:" + (num1 * num2));
					break;
				default:
					System.out.println("Operacion Incorrecta");
				}
				// System.out.println("Suma:" + resultado);
			}
		} while (!operacion.equals("F"));
		entrada.close();
	}

}
