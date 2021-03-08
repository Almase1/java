package ejercicios3;

import java.util.Scanner;

public class OrdenarArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ordenados();
	}
public static void ordenados() {
		
		
		int array [] = new int [5];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduce un numero: ");
			array[i] = scan.nextInt();
			
		}
		scan.close();
		
		boolean ordenDescen = false;
		boolean ordenAscen = false;
		boolean desorden = false;
		for (int i = 1; (i < array.length)&&(!desorden); i++) {
			
			if((array[i] < array[i - 1])&&(!ordenDescen)) {
				
				ordenDescen = true;
				
			}else if((array[i] > array[i - 1])&&(!ordenAscen)){
				
				ordenAscen = true;
				
			}
			
		}		
		
		if((ordenDescen)&&(ordenAscen)){
			
			desorden = true;
			
		}
		
		
		if ((ordenDescen) && (!desorden)){
			
			System.out.println("Estan ordenados de forma descendente");
			
		} else if ((ordenAscen) && (!desorden)){
			
			System.out.println("Estan ordenados de forma ascendente");

		}else {
			
			System.out.println("Estan desordenados");

			
		}
		
	}

}
