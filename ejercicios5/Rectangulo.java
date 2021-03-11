package ejercicios5;

public class Rectangulo extends Figura{
	
		Rectangulo(double x, double y){		    
	        super(x,y);	           
	    }
	    
	    @Override
	    public String area() {
	        
	        return "\nEl area es: " + this.getX() * this.getY();
	        
	    }

	    @Override
	    void pintar() {
	        
	        for(int i = 0; i < this.getY(); i++){
	        
	            System.out.println(" ");
	            for(int z = 0; z < this.getX(); z++){
	            
	                System.out.print("*");
	            
	            }
	        }    
	    }
	   

}
