package ejercicios5;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		 this.setNombre(nombre.toUpperCase());		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"-->Directivo";
	}


}
