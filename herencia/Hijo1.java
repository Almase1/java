package herencia;

public class Hijo1 extends Padre {

	private double paga_semanal;

	public double getPaga_semanal() {
		return paga_semanal;
	}

	public void setPaga_semanal(double paga_semanal) {
		this.paga_semanal = paga_semanal;
	}

	public Hijo1(int cod, String dato) {
		super(cod, dato);
		// TODO Auto-generated constructor stub
	}

	public Double paga_mensual()
	{
		return paga_semanal*4;
	}
	
}
