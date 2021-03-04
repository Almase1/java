package ejerciciosBuclesArrays;

public class Depurar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		String cadena="esto es una prrueba";
		int[] array=new int[5];
		
		num=10;
		if (num>=1000)
		{
			System.out.println("Mayor que 10");
		}
		else
		{
			System.out.println("Menor igual que 10");
		}	
		
		cadena=cadena.toUpperCase();

		
		for (int contador=0;contador<5;contador++)
		{	
			System.out.println(array[contador]);
		}
			
			

	}

}
