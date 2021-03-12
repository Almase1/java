package interfaz2;

import java.util.Scanner;

public class AdiviniarNumero implements Juego,Ficheros{
    
	private int numero=0;
	private int num_tiradas=0;
	
	
	@Override
	public void iniciar() {
		// Generar un numero aleatorio entre 1 y 100		
		this.setNumero( (int) (Math.random()*100)+1   );
	}

	@Override
	public void jugar() {
		int n1=0;
		Scanner teclado=new Scanner(System.in);
		do {
			num_tiradas=num_tiradas+1;
			System.out.println("introduce el numero:");
			n1=teclado.nextInt();
			if (numero>n1)
			{
				System.out.println("El numero que buscas es mayor");
			}
			else if (numero<n1)
			{
				System.out.println("El numero que buscas es menor");
			}				
			else
			{
				System.out.println("Lo encontraste");
			}
		}while(n1!=numero);

	}

	@Override
	public void finalizar() {
		System.out.println("Encontraste el numero "+numero+" despues de "+num_tiradas+" tiradas");

	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNum_tiradas() {
		return num_tiradas;
	}

	public void setNum_tiradas(int num_tiradas) {
		this.num_tiradas = num_tiradas;
	}

	@Override
	public void escribirResultado() {
		System.out.println("He guardado el resultado");
		
	}

}
