package ejerciciosBuclesArrays;

public class SumarNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		
		for (int i = 0; i < 15; i++) {
			int n = (int) (1 + Math.random() * 100);
			suma = suma + n;
			System.out.print(n + " ");
		}
		System.out.print("\n" + "La suma es " + suma);

	}

}
