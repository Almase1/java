package herencia;

public class Utilidades {
	public  String multaMayorImporte(Multa m1, Multa m2) {
		String cadena;
		if (m1.getImporte() > m2.getImporte()) {
			cadena = "El importe mayor es el de la multa: " + m1.getCodexpediente();

		} else if (m1.getImporte() < m2.getImporte()) {
			cadena = "El importe mayor es el de la multa: " + m2.getCodexpediente();
		} else {
			cadena = "Ambas multas tienen el mismo importe";
		}
		return cadena;
	}
}
