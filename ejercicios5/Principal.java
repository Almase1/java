package ejercicios5;

public class Principal {

	public static void main(String[] args) {
		/*Empleado E1 = new Empleado("Rafa");
		Directivo D1 = new 	Directivo("Mario");
		Operario OP1 = new Operario("Alfonso");
		Oficial OF1 = new Oficial("Luis");
		Tecnico T1 = new Tecnico("Pablo");
		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);*/
		//No se puede instancias un objeto de la clase Figura la ser abstracta
		//Figura fig1=new Figura();
		
		//Crear un objeto de tipo Rectangulo
		Rectangulo rec1=new Rectangulo(28, 4);
		System.out.println(rec1.area());
		rec1.pintar();
		System.out.println();
		System.out.println();

		//Crear un objeto de tipo linea
		Linea lin1=new Linea(75);
		System.out.println(lin1.area());
		lin1.pintar();
		System.out.println();

		//Crear un objeto de tipo circulo
		Circulo c1=new Circulo(78);
		System.out.println(c1.area());
		c1.pintar();
		
	}

}
