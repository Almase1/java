package ejercicios5;

public abstract class Figura {
	 	//Propiedades
		private double x;
	    private double y;
	    
	    //Constructores
	     Figura(double x, double y){
	     
	         this.setX(x);
	         this.setY(y);
	     
	     }
	     Figura(double x){
	     
	         this.setX(x);
	     }

	    //Getters y Setters
	    public double getX() {
	        return x;
	    }

	    public double getY() {
	        return y;
	    }

	    public void setX(double x) {
	        this.x = x;
	    }

	    public void setY(double y) {
	        this.y = y;
	    }

	    //Métodos abstractos
	    abstract String area();
	    abstract void pintar();

}
