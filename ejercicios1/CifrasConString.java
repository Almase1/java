package ejercicios1;

public class CifrasConString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(cifras(90111190));

	}
	public static int cifras(int numero) {

		//
		String c1;
		c1=String.valueOf(numero);       //Math.random()
		int cifras=c1.length();
		
		//int cifras = (String.valueOf(numero).length());
		

		return cifras;

	}
}
