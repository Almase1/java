package ejercicios3;

public class Figura {
	// nombre String
	// tipo string
	// lado1 double
	// lado2 double

	// Metodos
	// area

	// setter y getter

	private String nombre;
	private double lado1;
	private double lado2;
	private String tipo;
     
	Figura()
	{
		
	}
	
	Figura(double lad1, double lad2){
	    
        setLado1(lad1);
       
        setLado2(lad2);
    }

	
	
	public double area() {
		return (getLado1()* getLado2());
	}

public void setLado1(double lado1) {
        
        if(lado1 > 100){
            
            this.lado1 = 100;
        
        }else if (lado1 <= 0) {
            
            this.lado1 = 0;
        } else {
            
            this.lado1 = lado1;
        }  
    }

    public void setLado2(double lado2) {
        
        if(lado2 > 100){
            
            this.lado2 = 100;
        
        }else if (lado2 <= 0) {
            
            this.lado2 = 0;
        } else {
            
            this.lado2 = lado2;
        }
    }

	
	
	public String getNombre() {
		return nombre.toUpperCase();
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getLado1() {
		return lado1;
	}



	public double getLado2() {
		return lado2;
	}


}
