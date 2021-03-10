package interfaz;

public class Coche implements Int_Vehiculo{

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		double metros=(velocidad*velocidad)/180;
		//return Double.toString(metros);
		return "Tardas en frenar "+metros+" metros";
	}  

	@Override
	public String acelerar(int velocidad) {
		if (velocidad > VELOCIDAD_MAXIMA)
		{
			return "Vas a " +velocidad+" kilómetros por hora y por encima de la permitida que es "+VELOCIDAD_MAXIMA;
		}
		else
		{
			return "Vas a " +velocidad+" kilómetros por hora";
		}
		
	}

	@Override
	public Double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return (double) pvp+(pvp*21/100);
	}

}
