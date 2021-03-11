package interfaz2;

import java.util.Scanner;

public class Dados implements Juego {

	private String jugador1;
	private String jugador2;
	private int tirada_jugador1;
	private int tirada_jugador2;
	
	
	@Override
	public void iniciar() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca primer jugador:");
		setJugador1( teclado.next());
		System.out.println("Introduzca segundo jugador:");
		setJugador2( teclado.next());
		System.out.println("Jugadores "+getJugador1()+ " y "+getJugador2()+" todo listo para jugar");
	}

	@Override
	public void jugar() {
		tirada_jugador1=(int) (Math.random()*6)+1;
		tirada_jugador2=(int) (Math.random()*6)+1;
        System.out.println("El jugador 1 ha sacado un "+tirada_jugador1);
        System.out.println("El jugador 2 ha sacado un "+tirada_jugador2);
	}

	@Override
	public void finalizar() {
		if (tirada_jugador1>tirada_jugador2)
		{
			System.out.println("Ha ganado el jugador 1");
		}
		else if (tirada_jugador1<tirada_jugador2)
		{
			System.out.println("Ha ganado el jugador 2");
		}
		else
		{
			System.out.println("Empatados");
		}

	}

	/**
	 * @return the jugador1
	 */
	public String getJugador1() {
		return jugador1;
	}

	/**
	 * @param jugador1 the jugador1 to set
	 */
	public void setJugador1(String jugador1) {
		this.jugador1 = jugador1;
	}

	/**
	 * @return the jugador2
	 */
	public String getJugador2() {
		return jugador2;
	}

	/**
	 * @param jugador2 the jugador2 to set
	 */
	public void setJugador2(String jugador2) {
		this.jugador2 = jugador2;
	}

}
