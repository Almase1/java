package ejercicios5;

public class Empleado {
	
	public Empleado() {
		// TODO Auto-generated constructor stub
		// estoy en el constructor por defecto
		System.out.println("Has pasado por el constructor primario");
	}
	
	Empleado(String nombre)
	{
		
		this.setNombre(nombre);
	}
	
	private String nombre;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Empleado:"+getNombre();
	}
	
	
}
