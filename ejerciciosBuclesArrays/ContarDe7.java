package ejerciciosBuclesArrays;

import java.util.Scanner;

public class ContarDe7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
        //contar desde 0 a 100 de 7 en 7
        for ( int i=0 ; i<=100 ;i += 7)
        {
    		System.out.print(i+" ");
        }	
        
        
        //Pedir un nuero y contar desde ese numero
        System.out.println("\n\tIntroduzca un numero: ");
        Scanner n = new Scanner(System.in);
        int numero;
		numero=n.nextInt();
		
		for ( int i=100 ; i>=numero ;i -= 7)
		System.out.print(i+" ");
		
	}



}
