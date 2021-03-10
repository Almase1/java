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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcularPrecio(int pvp) {
		// TODO Auto-generated method stub
		return null;
	}

}
