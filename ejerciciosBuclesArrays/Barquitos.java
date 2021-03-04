package ejerciciosBuclesArrays;

import java.util.Scanner;

public class Barquitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char barco[]=new char[10];
     int posicion=(int)  (Math.random()*10)+1;
          
     barco[posicion]='X';
     barco[posicion+1]='X';
     barco[posicion+2]='X';
     
     Scanner n = new Scanner(System.in);
     int numero;
     boolean acierto=false;
     
     do
     {
    	 System.out.println("Introduce una poscion:");         
 		 numero=n.nextInt();
 		 if (barco[numero]=='X')
 		 {
 	    	 System.out.println("Acertaste");
 	    	 acierto=true;
 		 }
 			  		
     }while (!acierto);
     
     //Pintar el bucle
     
     for (int i=0;i<barco.length;i++)
    	 System.out.print(barco[i]);
	}

}
