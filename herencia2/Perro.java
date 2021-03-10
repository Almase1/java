package herencia2;

public class Perro  extends Animal{
	//Propiedades del perro
	
	private boolean peligroso;
	
	public boolean isPeligroso() {
		return peligroso;
	}
	public void setPeligroso(boolean peligroso) {
		this.peligroso = peligroso;
	}
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "GUAUUUUU";
	}
	
	
	
}
