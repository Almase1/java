package bucles;

public class BuclesEtiquetas {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b=true;
		
		
		//Bucle principal
  principal:  while (b) {
			  System.out.println("estoy en el bucle Principal");
			     //Bucle secundario
		secundario:  for(int x=0; x<=10; x++) {
			    	 System.out.println("estoy en el bucle Secundario:"+x);
			    	 if (x==5) break principal;
			     }
		}
	}

}
