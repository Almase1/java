package herencia2;

public class Animal {
	
	//Atributos
	private int patas;
	private String color;
	private boolean castrado;
	private char sexo;
	
	//Setters y Getters
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	
	public boolean isCastrado() {
		return castrado;
	}
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	//Metodos
	public String sonido() {
		return "no tengo sonido todavia";
	}
	
	@Override
	public String toString() {
		return "Es un animal de color:"+color+" y tiene "+patas+" patas";
	}

	//Generar un Chip para el animal
	public String chip()
	{
		return "codigo-AA-"+(Math.random()*10+5000);
	}
	
	
}
