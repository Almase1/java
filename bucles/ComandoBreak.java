package bucles;

import java.util.Scanner;

public class ComandoBreak {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		int n1;
		int n2;
		n1 = numero.nextInt();
		n2 = numero.nextInt();
		while (n1 <= n2) {
			System.out.print(n1 + "-");
			n1++;
			if (n1==12) break;
		}
		System.out.println("Te has salido con un valor:"+n1);
		
		//Pedir 2 numeros y pintar todos los numeros entre ellos. Hacer un break cuando uno sea primo
		//primos --> dibisible solo por si mismo y por el uno (una division exacta no es primo)
		
	}
}
