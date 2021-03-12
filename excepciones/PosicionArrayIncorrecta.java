package excepciones;

public class PosicionArrayIncorrecta {

	public static void main(String[] args) {
       
		int array1[]= {2,4,1,6};
		
		try {
		System.out.println(array1[4]);
		}
		catch (Exception mi_error) {
			System.out.println("Ma parece que no existe esa posicion");
		}
		
		
		
	}

}
