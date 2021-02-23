package variablesyoperadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*
     * ==    !=   <=  >=  >  <
     * 
     */
		
		int z=10;
		int r=9;
		System.out.println(z<r);
		
	/*
	 * &&   --> AND
	 * ||  --> OR
	 * !    NOT
	 */
	  int x=90;	
	  System.out.println(z<r || x>r);
	  System.out.println(z<r && x>r);
	  System.out.println(  !(z<r && x>r) ) ;
	  // Operador TERNARIO
	  String cadena=z<r?"Si":"No";    // if (z<r) "if" else "no"
	  
	  System.out.println(cadena);
	  
	  // Comprobar si un numero es par
	  int num1=11;
	  int num2=2;
	  System.out.println(num1%num2==0?"Par":"impar");
	 	  
	}

}
