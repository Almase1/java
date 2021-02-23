package variables;

public class Variables1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean v=true;
		char letra='x';
		double d1=3.10;
		long l=189090;
		int i=10;  //32 
		short s=200; //16
		float f=2.4f;
		byte b=127;  //8
		
		
        /*
         * Variables con Nombre y apellido. Variables con slario e IRPF
         * Visualizar todo (Te llamas pepito, ganax X euros y tus impuestos son irpf
         * 
         */
		
		String nombre="Alberto";
		String apellidos="XXXXXXX";
		long salario=1000;
		int irpf=10;
		long impuesto=salario/irpf;
		System.out.println("Tu nombre es " + nombre+ " " + apellidos+ " y ganas "+salario+" y tienes un irpf de "+impuesto);
		
	}

}
