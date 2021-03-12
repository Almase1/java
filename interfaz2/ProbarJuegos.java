package interfaz2;

public class ProbarJuegos {

	public static void main(String[] args) {
		Dados d1 = new Dados();
		d1.iniciar();
		d1.jugar();
		d1.finalizar();
		d1.escribirResultado();
		System.out.println(d1.mensaje("He terminado el juego"));
		
		AdiviniarNumero adi1=new AdiviniarNumero();
		adi1.iniciar();
		adi1.jugar();
		adi1.finalizar();
		adi1.escribirResultado();
	}

}
