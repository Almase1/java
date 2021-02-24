package bucles;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=1;
		do {			
			System.out.println(x);
			x++;					
		}while(x<10);
		
		//Pedir un numero por teclado y retroceder hasta 0
		Scanner numero= new Scanner(System.in);	
		int n1;
		n1=numero.nextInt();
		do {
			System.out.print(n1+"-");
			n1--;
		}while (n1>=0);		
		
		numero.close();
	}

}
