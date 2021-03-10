package herencia2;

public class Principal {

	public static void main(String[] args) {
		
		//Objeto de la clase Animal
		Animal animal1 = new Animal();
		animal1.setPatas(4);
		animal1.setColor("Blanco");
		System.out.println(animal1.sonido());
		System.out.println(animal1);
		System.out.println(animal1.chip());

		//OBjeto de la clase Gato
		Gato gato1 = new Gato();
		System.out.println(gato1.sonido());
		System.out.println(gato1.chip());
		
		//Objeto de la clase Perro
		Perro perro1=new Perro();
		System.out.println(perro1.sonido());
		System.out.println(perro1.chip());
		
		//Objeto de la clase Hamster
		Hamster ham1=new Hamster();
		System.out.println(ham1.sonido());
		System.out.println(ham1.chip());
		
		//Objeto de la clase Rapaz
		Rapaz rapaz1=new Rapaz();
		System.out.println(rapaz1.sonido());
		System.out.println(rapaz1.chip());
		
		//OBjeto de la clase periquito		
		Periquito peri1=new Periquito();
		System.out.println(peri1.sonido());
		System.out.println(peri1.chip());
	}

}
