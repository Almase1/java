package herencia;

public class Principal {
    public static void main(String[] args) {
		
	
	/*
	Padre p1=new Padre(1,"hola");
          
    System.out.println(p1.getDato());
    System.out.println(p1.getCod());
    
    Hijo1 h1=new Hijo1(100, "Pedro");
    h1.setPaga_semanal(200);
    
    System.out.println(h1.getDato());
    System.out.println(h1.getCod());
    System.out.println(h1.getPaga_semanal());
    System.out.println(h1.paga_mensual());
*/
    	Expediente ex1=new Expediente();
    	ex1.setCodexpediente(100000);
    	ex1.setDescripcion("Desripcionvckls ajnmkfjdkflasl");
    	ex1.setResponsable("Pedro");
    	ex1.setTipo("Z");
    	ex1.verdatos();		
    			
    
   
    
    }
}
