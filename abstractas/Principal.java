package abstractas;

public class Principal {

	public static void main(String[] args) {
		//
		// No se pueden instanciar objetos de una clase abstracta
		// Avion avion1=new Avion();

		// objeto de la clase caza
		Caza caza1 = new Caza();
		caza1.setModelo("F-18 Hornet");
		caza1.setNum_misiles(2);
		caza1.setPotencia(1000); // Es un caza modelo XXXXXX con una potencia de fuengo de NNNN misiles

		System.out.println(caza1);

		// Objeto de la clase AvionPasajeros
		AvionPasajeros avion1 = new AvionPasajeros();
		avion1.setModelo("Airbus A-380");
		avion1.setNum_pasajeros(1000);
		avion1.setTonelaje(90000);

		System.out.println(avion1); // Es un avion XXXXXXXXX con un numero de pasajeros de XXXXXXX
		System.out.println(avion1.Beneficio(100));

		Caza caza2 = new Caza();
		caza2.setPotencia(1000);
		if (caza1.equals(caza2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}

		
		AvionPasajeros avion2 = new AvionPasajeros();
		avion2.setModelo("Airbus A-380");
		avion2.setNum_pasajeros(1000);
		if (avion1.equals(avion2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}

	}

}
