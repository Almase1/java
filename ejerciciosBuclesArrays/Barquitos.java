package ejerciciosBuclesArrays;

import java.util.Iterator;
import java.util.Scanner;

public class Barquitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 //Creo el array del mar
     char barco[]=new char[10];
     
     //Rellear el array con -
     for (int i = 0; i < barco.length; i++) {
		barco[i]='-';
	}
     
     //Genero una posicion teniendo en cuenta el tamaño del barco
     int posicion=(int)  (Math.random()*7)+1;
     
     //Pongo el barco en el array     4-5-6
     barco[posicion]='X';
     barco[posicion+1]='X';
     barco[posicion+2]='X';
     
     //Prepar la entrada
     Scanner n = new Scanner(System.in);
     int numero;
     
     //Boolean para salir del bucle
     boolean acierto=false;
     do
     {
    	 System.out.println("Introduce una posicion:");         
 		 numero=n.nextInt();
 		 //si la posicion tiene un X, hundido
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
