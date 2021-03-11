package interfaz;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Coche coche1=new Coche();
     System.out.println(coche1.frenar(190));
     System.out.println(coche1.acelerar(190));
     System.out.println("El coche vale:" +coche1.calcularPrecio(22000));

     Camion camion1=new Camion();
     camion1.setPeso(1000);
     System.out.println(camion1.frenar(120));
     System.out.println(camion1.acelerar(30));
     System.out.println("El coche vale:" +camion1.calcularPrecio(22000));



     
	}

}
