package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		Persona p2 = new Persona();

		p1.mostrar();
		System.out.println(p1.saludar("hola"));

		p1.setNombre("alberto");
		p2.setNombre("rosa");

		p1.setSalario(10000);
		System.out.println(p1.getNombre() + " " + p2.getNombre());

		// Probando la clase VEHICULO

		Vehiculo v1 = new Vehiculo();
		v1.setRuedas(4);
		v1.setCv(100);
		System.out.println(v1.getRuedas());
		System.out.println(v1.getPotencia());

		v1.setTipo(5);
		v1.setPvp(1000);
		System.out.println(v1.precio());

		// Crear objeto de la clase

		// Utilidades ut1=new Utilidades();

		if (Utilidades.numeroPrimo(v1.getPvp())) {
			System.out.println("Primo");
		} else {
			System.out.println("no es Primo");
		}

		if (Utilidades.parImpar(v1.getPvp())) {
			System.out.println("Par");
		} else {
			System.out.println("no es Par");
		}
		
		//Constructores
		
		Vehiculo v2=new Vehiculo();
		v2.verDatos();		
		
		
		//Probar constructor con parametros
		System.out.println();
		Vehiculo v3=new Vehiculo(2);
		v3.verDatos();
		
		System.out.println();
		Vehiculo v4=new Vehiculo('B');
		v4.verDatos();

		System.out.println();
		Vehiculo v5=new Vehiculo(19000,"bastido1");
		v5.verDatos();

	}
	
	
	
	
	
	
	
	
	
	

}
