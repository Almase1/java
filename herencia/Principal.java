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
		
		//Creo dos expediente
		Expediente ex1=new Expediente(10, "A");
		Expediente ex2=new Expediente(20, "A");
		//Creo un array de Expediente de 2 posiciones
		Expediente ex[]=new Expediente[2];
		//Cargo el array
		ex[0]=ex1;
		ex[1]=ex2;
		ex[0].setDescripcion("Priemro");
		ex[1].setDescripcion("Segundo");
		m1(ex);
		*/
		//Crear un array de multas de 50 posiciones
		
		
		Multa multas[]=new Multa[50];
		
		//Relleno con descripcion e importe
		for (int i=0;i<multas.length;i++) {		
			multas[i]=new Multa(i, "A");
			multas[i].setDescripcion("Descripion "+i);
			multas[i].setImporte((Math.random()*1000+25));
		}
		
		System.out.println( calcularMayor(multas));		
		
		Multa multa1=new Multa(10, "A");
		multa1.setImporte(1000);
		multa1.setDescripcion("Mi primera multa");
		multa1.setResponsable("Alberto");
		Multa multa2=new Multa(20, "A");
		multa2.setImporte(2000);
		Utilidades util1=new Utilidades();
		System.out.println(util1.multaMayorImporte(multa1, multa2));
		//System.out.println(conocerTipo(mt1));
		System.out.println(multa1);
		
		
	}
	
	public static String calcularMayor(Multa[] m1) {
		double mayor=0;
		int codigo=0;
		for(int x=0;x<m1.length;x++)
		{
			if (m1[x].getImporte()>mayor)
			{
				mayor=m1[x].getImporte();
				codigo=m1[x].getCodexpediente();
			}
		}
		return mayor+" "+codigo;
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

	

	public static String m1(Expediente[] e1)
	{
		for (int x=0;x<e1.length;x++)
		{
			System.out.println(e1[x].getDescripcion());
		}
		return "x";
	}
}
