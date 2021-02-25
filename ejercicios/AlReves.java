package ejercicios;

public class AlReves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		// dos cadenas de Enteros de 5 posiciones
		// Rellenamos una cadena con numeros
		// Pasamos los numeros de una cadena a otra dandoles la vuelta. Al reves
		// c1=1,2,3,4,5
		// c2=5,4,3,2,1
		
		int[] array1= {23,45,34,67,78};
		
		int[] array2= new int[5];
		
		//Averiguar la longitud del array1
		int longitud=array1.length-1;
		
		//Rellenar ARRAY2
		for(int x=longitud;x>=0;x--) {
			array2[x]=array1[longitud-x];
		}
		
		//Pintar ARRAY
		for (int x=0;x<=longitud;x++) {
			System.out.print(array2[x]+"-");
		}
		
	}

}




