package herencia2;

public class Rapaz extends Pajaro {
	private int envergadura;
	private double velocidad;
	/**
	 * @return the envergadura
	 */
	public int getEnvergadura() {
		return envergadura;
	}
	/**
	 * @param envergadura the envergadura to set
	 */
	public void setEnvergadura(int envergadura) {
		this.envergadura = envergadura;
	}
	/**
	 * @return the velocidad
	 */
	public double getVelocidad() {
		return velocidad;
	}
	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return "hjiiiiiiiiiii";
	}
		
		

}
