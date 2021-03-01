package ejercicios;


public class Tragaperras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tragaperras[] = new int[3];

		//Entrar en el bucle. Hacerlo 3 veces
		for (int i = 0; i < tragaperras.length; i++) {
			//Posicion del array le asocia un aleatorio
			tragaperras[i] = (int) (Math.random() * 3) + 1;  
			
			if (tragaperras[i] == 1) {
				System.out.print("* ");
			} else if (tragaperras[i] == 2) {
				System.out.print("x ");
			} else if (tragaperras[i] == 3) {
				System.out.print("o ");
			}
		}
		
		System.out.println("");

		if (tragaperras[0] == tragaperras[1] && tragaperras[1] == tragaperras[2]) {
			System.out.println("Premio gordo.");
		}

		else if (tragaperras[0] == tragaperras[1] || tragaperras[0] == tragaperras[2]
				|| tragaperras[1] == tragaperras[2]) {
			System.out.println("Premio mediano.");
		}

		else {
			System.out.println("No hay premio.");
		}
	}

}
