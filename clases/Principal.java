package clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Persona p1= new Persona();
	     Persona p2= new Persona();
	     
	     p1.mostrar();
	     System.out.println( p1.saludar("hola") );
	     
	     p1.setNombre("alberto");
	     p2.setNombre("rosa");
	     
	     p1.setSalario(10000);
	     System.out.println( p1.getNombre() +" "+p2.getNombre());
		
		//Probando la clase VEHICULO
	     
	     Vehiculo v1=new Vehiculo();
	     v1.setRuedas(4);
	     v1.setCv(100);
	     System.out.println(v1.getRuedas());
	     System.out.println(v1.getPotencia());
	     
	     v1.setTipo(5);
	     v1.setPvp(1000);
	     System.out.println(v1.precio());
		
	}

}
