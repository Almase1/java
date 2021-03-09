package herencia2;

public class Principal {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.setPatas(4);
		animal1.setColor("Blanco");
		System.out.println(animal1.sonido());
		System.out.println(animal1);
			
		
		Gato gato1 = new Gato();
		System.out.println(gato1.sonido());
		
	}

}
