package arrays;

public class ClaseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x=0;
      int z;
      
      //Dos opciones
      // Estilo C++
      int array1[];
      //estilo Java
      int[] array2;
      
      int[] array3= {20,30,40,34,37};
      
      System.out.println("Recorro el bucle");
      
      for(int contador=0;contador<=4;contador++)
      {
    	  System.out.print(array3[contador]+"-");
      }
      
      System.out.println("\nRecorro el bucle al reves");
      
      for(int contador=4;contador>=0;contador--)
      {
    	  System.out.print(array3[contador]+"-");
      }
	}

}
