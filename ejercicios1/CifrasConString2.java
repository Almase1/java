package ejercicios1;

import java.util.Scanner;

public class CifrasConString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Dime un número:");
		String n1 = scan.next();

		System.out.println("Este numero tiene " + n1.length() + " cifras");


		scan.close();

	}

}
