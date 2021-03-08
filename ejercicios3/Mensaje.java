package ejercicios3;

public class Mensaje {
	
	private final int IVA=16;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Constantes
		final String cadena="alberto";


		for (int x=0;x<args.length;x++)
		{
			System.out.println(args[x]);
		}
	   String mayor=(Integer.parseInt(args[0])> Integer.parseInt(args[1])? args[0]: args[1]);
	   
	   Double.parseDouble("10");
	   Float.parseFloat("300");
	   
	   System.out.println("El mayor es:"+mayor);

	}
}

