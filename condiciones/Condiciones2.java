package condiciones;

import java.util.Scanner;

public class Condiciones2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner numero= new Scanner(System.in);	
	int n1;
	int n2;
	n1=numero.nextInt();	
	n2=numero.nextInt();
	
	if (n1> n2)
		System.out.println(n1);
	else
		System.out.println(n2);
	numero.close();
	}

}
