package ejercicios2;

import java.util.Scanner;

public class TablasMultidimension {
	

		public void multiDimension() {
			int[][] lista = new int[5][5];
		
			//Poner la suma en cada celda del array
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					lista[i][j] = i + j;
				}
			}
			
			
			//Visualizar el array
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.print(lista[i][j]+"-");
				}
				System.out.println("\n");
			}
		}
		public void diagonalesSiete(){
			
			//Declarar array
	        int[][] array = new int[7][7];
	   
	        //Rellenar el array
	        for(int i = 0; i < array.length; i++){
	        
	            System.out.println("");
	            for(int x = 0; x < array.length; x++){
	            
	                if(i == x){
	                
	                     array[i][x] = 1;
	                }else {
	                
	                     array[i][x] = 0;
	                }
	                System.out.print(array[i][x]);
	            }
	        }
	   }
		public void matrices_2() {
			// Crear una tabla de tamaño 7x7 y rellenarla de forma que los elementos de la
			// diagonal
			// principal sean 1 y el resto 0.
			int T[][] = new int[7][7];
			
	

			// Relleno la tabla
			for (int n = 0; n < T.length; n++) {

				T[n][n] = 1;

			}
			

			// Muestra la tabla
			for (int z = 0; z < T.length; z++) {
				for (int h = 0; h < T[z].length; h++) {
					System.out.print(T[z][h]);
				}
				System.out.println();
			}
		}
		public void metodo3() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Introduce filas: ");
			final int FIL = sc.nextInt();
			System.out.print("Introduce columnas: ");
			final int COL = sc.nextInt();
			char [][] tabla = new char[FIL][COL];
			
			for (int i = 0; i < FIL; i++) {
				for (int j = 0; j < COL; j++) {
					tabla[i][j] = '*';
//					System.out.print(tabla[i][j] + " ");
				}
//				System.out.println();
			}
			
			for (int i = 0; i < FIL; i++) {
				for (int j = 0; j < COL; j++) {
					System.out.print(tabla[i][j] + " ");
				}
				System.out.println();
			}
		}
		public void metodo3(int lado1,int lado2) {
			
			char [][] tabla = new char[lado1][lado2];
			
			for (int i = 0; i < lado1; i++) {
				for (int j = 0; j < lado2; j++) {
					tabla[i][j] = '*';
//					System.out.print(tabla[i][j] + " ");
				}
//				System.out.println();
			}
			
			for (int i = 0; i < lado1; i++) {
				for (int j = 0; j < lado2; j++) {
					System.out.print(tabla[i][j] + " ");
				}
				System.out.println();
			}
		}

		public void cubo() {
			
			int[][][] matriz = new int [3][3][3];
			
			//rellenar con 1 lamina central
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					for (int k = 0; k < matriz[i][j].length; k++) {
						if (k == 1) {
							
							matriz[i][j][k] = 1;
							
						}
					}
				}
			}
			
			//mostrar por laminas
			for (int i = 0; i < matriz.length; i++) {
				System.out.println("Lámina " + (i + 1));
				for (int j = 0; j < matriz[i].length; j++) {
					for (int k = 0; k < matriz[i][j].length; k++) {
							
							System.out.print(matriz[j][k][i]);
							
						
					}
					System.out.println();
				}
				System.out.println();
			}
			
		}

		public void mostrarArrays()
		{
			int [] array0=new int[3];
   			int[] [] array1=new int [3][3];
			int[][][] matriz = new int [3][3][3];
			
			//Unidimensional
			for (int i = 0; i < array0.length; i++) {
				array0[i]=1;
			}
			
			//Bidimensional
			for (int i = 0; i < array1.length; i++) {
				for (int j = 0; j < array1.length; j++) {
					array1[i][j]=1;
					
				}
				
			}
			
			//Multidimensional
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					for (int k = 0; k < matriz[i][j].length; k++) {
						if (k == 1) {
							
							matriz[i][j][k] = 1;
							
						}
					}
				}
			}
			System.out.println();
		}
	
		
}
