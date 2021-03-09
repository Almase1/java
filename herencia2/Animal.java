package herencia2;

public class Animal {
	
	//Atributos
	private int patas;
	private String color;
	
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
	
	//Metodos
	public String sonido() {
		return "no tengo sonido todavia";
	}
	@Override
	public String toString() {
		return "Es un animal de color:"+color+" y tiene "+patas+" patas";
	}

	
	
	
}
