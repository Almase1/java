package interfaz;

public class Camion implements Int_Vehiculo {
	
	private int peso;

	@Override
	public String frenar(int velocidad) {
		double metros=(velocidad*velocidad)/180+((this.getPeso()/100)*2);
		//return Double.toString(metros);
		return "Tardas en frenar "+metros+" metros";
	}

	@Override
	public String acelerar(int velocidad) {
		String marcha="";
		if (velocidad>0 && velocidad <=20) marcha="primera"; 
		if (velocidad>20 && velocidad <= 40) marcha="segunda";
		if (velocidad >40) marcha="quinta";
		if (velocidad > VELOCIDAD_MAXIMA)
		{
			return "Vas a " +velocidad+" kilómetros por hora y por encima de la permitida que es "+VELOCIDAD_MAXIMA+" y llevas puesta l marcha:"+marcha;
		}
		else
		{
			return "Vas a " +velocidad+" kilómetros por hora"+" y llevas puesta l marcha:"+marcha;
		}
	}

	@Override
	public Double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return (double) pvp+(pvp*10/100);
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

}
