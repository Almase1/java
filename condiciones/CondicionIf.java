package condiciones;

import java.util.Scanner;

public class CondicionIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*  Solo es un comando
		 * if (condicion) comando1;
		 * 
		 * 
		 * if (condicion)
		 * {
		 *     s1;
		 *     s2;
		 *     s3;
		 *  }
		 *  
		 *  if (condicion)
		 * {
		 *     s1;
		 *     s2;
		 *     s3;
		 *  }
		 *  else
		 *  {
		 *     s1;
		 *     s2;
		 *  }
		 *  
		 *  
		 *  if (condicion)
		 * {
		 *     s1;
		 *     s2;
		 *     s3;
		 *  }
		 *  else if (condicion){
		 *     s1;
		 *     s2;
		 *     }
		 *  else{
		 *     s1;
		 *     s2;
		 *  }
		 *  
		 *  
		 *  
		 *  
		 *  
		 * 
		 */

		//Saber si un numero es par con if
		int n1=10;
		if (n1%2==0)
		{
			System.out.println("Par");
		}
		else
		{
			System.out.println("Impar");
		}
		
		//Pedir una cadena por teclado
		System.out.println("Por favor, introduce tu nombre:");
		
		Scanner nombre = new Scanner(System.in);
        String cadena = nombre.nextLine();
        
        
        
        System.out.println(cadena);
        
		
	}

}
