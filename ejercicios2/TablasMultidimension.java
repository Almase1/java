package ejercicios2;

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



}
