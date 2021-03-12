package excepciones;

public class PosicionArrayIncorrecta {

	public static void main(String[] args) {

		// Defino el array
		int array1[] = { 2, 4, 1, 6 };

		// Bloque Try-Catch
		try {
			System.out.println(array1[6]);
			System.out.println(10 / 0);
		} catch (ArrayIndexOutOfBoundsException mi_error) {
			System.out.println("Me parece que no existe esa posicion");
		} catch (ArithmeticException e1) {
			System.out.println("Has dividido por CERO");
		} catch (Exception e2) {
			System.out.println("Error desconocido:" + e2.getMessage());
		}
	}

}
