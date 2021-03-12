package excepciones;

public class DivisionPorCero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=10;
      int resultado=0;
	
      
      try {
		resultado = x/0;
	} catch (Exception e) {
		//System.out.println("Ten cuidado, se ha producido el erro:"+e.getMessage());
		resultado = x/1;

	}
     
      
      
      
      System.out.println("el resultado es:"+resultado);
	}

}
