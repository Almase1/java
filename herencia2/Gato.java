package herencia2;

public class Gato extends Animal {

	private boolean castrado;
	private char sexo;
	/**
	 * @return the castrado
	 */
	public boolean isCastrado() {
		return castrado;
	}
	/**
	 * @param castrado the castrado to set
	 */
	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}
	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "Miauu";
	}
	
	
	
}
