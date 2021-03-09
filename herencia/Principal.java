package herencia;

public class Principal {
	public static void main(String[] args) {

		/*
		 * Padre p1=new Padre(1,"hola");
		 * 
		 * System.out.println(p1.getDato()); System.out.println(p1.getCod());
		 * 
		 * Hijo1 h1=new Hijo1(100, "Pedro"); h1.setPaga_semanal(200);
		 * 
		 * System.out.println(h1.getDato()); System.out.println(h1.getCod());
		 * System.out.println(h1.getPaga_semanal());
		 * System.out.println(h1.paga_mensual());
		 * 
		 * Expediente ex1=new Expediente(10, "A"); ex1.setCodexpediente(100000);
		 * ex1.setDescripcion("Desripcionvckls ajnmkfjdkflasl");
		 * ex1.setResponsable("Pedro"); ex1.setTipo("Z"); ex1.verdatos();
		 * 
		 * 
		 * Multa m1=new Multa(20,"B"); m1.setCodexpediente(90000);
		 * m1.setDescripcion("fmlsfklafkldsjaklfjflka"); m1.setTipo("X");
		 * m1.setResponsable("pepito"); m1.setImporte(1000);
		 * 
		 * m1.verdatos(); m1.getImporte();
		 */
		Multa_Trafico mt1 = new Multa_Trafico(1000, "B");
		mt1.setDescripcion("Saltar un ceda el paso");
		mt1.setResponsable("conductor");
		mt1.setMatricula("M111111");
		mt1.verdatos();

		MultaCovid mt2 = new MultaCovid(1000, "B");
		mt2.setDescripcion("Saltar un ceda el paso");
		mt2.setResponsable("conductor");
		mt2.setMascarilla(false);
		mt2.setFecha("10/10/2020");
		mt2.verdatos();

		Expediente expe1 = new Expediente(10, "A");

		System.out.println(saberTipo(expe1));
		System.out.println(saberTipo(mt2));
		System.out.println(saberTipo(mt1));

		Multa multa1=new Multa(10, "A");
		multa1.setImporte(1000);
		multa1.setDescripcion("Mi primera multa");
		multa1.setResponsable("Alberto");
		Multa multa2=new Multa(20, "A");
		multa2.setImporte(2000);
		System.out.println(multaMayorImporte(multa1, multa2));
		//System.out.println(conocerTipo(mt1));
		System.out.println(multa1);
	}

	public static String saberTipo(Expediente c1) {

		if (c1 instanceof Multa_Trafico) {
			return "Eres Trafico";
		}
		if (c1 instanceof MultaCovid) {
			return "Eres covid";
		}
		if (c1 instanceof Multa) {
			return "Eres Multa";
		}
		if (c1 instanceof Expediente) {
			return "Eres Expediente";
		}
		return "No se";
	}
	
	public static String conocerTipo(Object x) {
		return "Eres de tipo-->"+ x.toString();
	}
	
	//Object

	public static String multaMayorImporte(Multa m1, Multa m2) {
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
