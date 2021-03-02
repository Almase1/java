package clases;

public class Persona {
//Propiedades   (variables) 
		
	public int getEdad() {
		return edad;
	}


	public void setEdad(int e) {
		edad = e;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String n) {
		nombre = n;
	}


	public long getSalario() {
		return salario;
	}


	public void setSalario(long salario) {
		this.salario = salario;
	}

	private String nombre;
	private long salario;
	private int edad;

	
	//Metodos setters   getters
	
	
	
//Metodos
	
	public void mostrar()
	{
		System.out.println("Estoy en una instancia de la clase Persona");
	}
	
	
	public String saludar(String nombre)
	{
		return nombre.toUpperCase();
	}
	
	private void metodo_privado()	
	{
		System.out.println("Estoy en un metodo privado");
	}
	
}
