package clases;

public class Vehiculo {

	// tipo String
	// ruedas int
	// bastidor String
	// cv int
	// pvp double

	// atributos de la clase
	private int tipo = 0;
	private int ruedas;
	private String bastidor;
	private int cv;
	private double pvp=1;

	// Getters and Setters
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		if (tipo == 1 || tipo == 2 || tipo == 3) {
			this.tipo = tipo;
		} else {
			System.out.println("Los datos son del 1 al 3");
		}
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getBastidor() {
		return bastidor;
	}

	public void setBastidor(String bastidor) {
		this.bastidor = bastidor;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public int getPotencia() {
		return cv * 2;
	}

	// Crear un metodo llamado Precio
	// pvp + impuesto
	// tipo=1 --> 10%
	// tipo=2 --> 12%
	// tipo=3 --> 15%
	//
	// Cambiar el metodo setTipo
	// Solo debe admitir del 1 al 3
	
	public double precio()
	{
		double impuestos=0;
		if (tipo==0)  return pvp;
		if (tipo==1)  impuestos=10;
		if (tipo==2)  impuestos=12;
		if (tipo==3)  impuestos=15;
		
		return pvp+(pvp*impuestos/100);
	}

}
