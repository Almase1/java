package herencia;

	public class Multa_Trafico extends Expediente {
		
		public Multa_Trafico(int codexpediente, String tipo) {  //método del padre "Expediente"
			super(codexpediente, tipo);
			// TODO Auto-generated constructor stub
		}
		
		private String matricula;
		private String fecha;

		public final String getMatricula() {
			return matricula;
		}

		public final void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public final String getFecha() {
			return fecha;
		}

		public final void setFecha(String fecha) {
			this.fecha = fecha;
		}

		@Override
		public void verdatos() {
			// TODO Auto-generated method stub
			super.verdatos();
			System.out.println("La matrícula es " + matricula + " y la fecha es " + fecha);
		}
	}


