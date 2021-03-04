package ejerciciosBuclesArrays;

public class ContarParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		generarCien();
		
		
	}
	
	public static void generarCien(){
		   
	       int numero = 0;
	       int pares = 0;
	       int impares = 0;
	       int ceros = 0;
	       int mediaPares = 0;
	       int mediaImpares = 0;
	       
	       for(int i = 0; i <= 100; i++){
	       
	           numero = (int)(Math.random()*10+1)+1;
	           if(numero%2 == 0){
	               
	        	   //suma de pares
	               pares=pares+numero;
	               //numero de pares
	               mediaPares++;
	               
	               
	               if(numero == 0 ){
	               
	                   ceros++;
	               }
	               
	           } else if(numero%2 !=0){
	           
	        	   //suma de impares
	               impares=impares+numero;
	               
	               //contador impares
	               mediaImpares++;
	               
	           } 
	           
	       }
	       
	       System.out.println("La suma de los pares es: " + pares);
	       System.out.println("La suma  de impares es: " + impares);
	       System.out.println("La media de pares es: " + (pares/mediaPares));
	       System.out.println("La media de impares es: " + (impares/mediaImpares));
	       System.out.println("Los ceros son: " + ceros);
	   
	   
	   }

}
