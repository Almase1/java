package abstractas;

public class AvionPasajeros extends Avion {
	private int num_pasajeros;
	private int num_pilotos;

	// SETTERS AND GETTERS

	public final int getNum_pasajeros() {
		return num_pasajeros;
	}

	public final void setNum_pasajeros(int num_pasajeros) {
		this.num_pasajeros = num_pasajeros;
	}

	public final int getNum_pilotos() {
		return num_pilotos;
	}

	public final void setNum_pilotos(int num_pilotos) {
		this.num_pilotos = num_pilotos;
	}

	// METODOS

	public double Beneficio(double pvp_billete) {
		return (pvp_billete * num_pasajeros);
	}
	
	@Override
	public String repostar() {
		// TODO Auto-generated method stub
		return "Reposto en el aeropuerto y en la Base";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Ess un avion "+getModelo()+"  con un numero de pasajeros de "+getNum_pasajeros(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		// Convertimos obj a AvionPasajeros
		AvionPasajeros Comparado = (AvionPasajeros) obj;

		if (this.getNum_pasajeros() == Comparado.getNum_pasajeros() && this.getModelo() == Comparado.getModelo()) {
			return true;
		} else {
			return false;
		}
	}

	
	
	
	

}
