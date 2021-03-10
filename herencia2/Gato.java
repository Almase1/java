package herencia2;

public class Gato extends Animal {

	private boolean ronronea;
	
		
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Miauu";
	}

	public boolean isRonronea() {
		return ronronea;
	}

	public void setRonronea(boolean ronronea) {
		this.ronronea = ronronea;
	}
	
	
	
}
