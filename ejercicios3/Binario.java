package ejercicios3;

public class Binario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    mostrarBinario(100);
	}
	public static void mostrarBinario(int num) {
		int resto, counter = 8;
		boolean control = false;
		int[] helper = new int[8];
		if(num!=0) {
			while(num >= 1) {
				counter--;
				resto = num % 2;
				num = num / 2;
				if(resto == 0) {
					helper[counter] = resto;
				}else {
					helper[counter] = resto;
					control = true;
				}
				
			}
			if(!control) {
				helper[counter] = 1;
			}
		}
		for (int i = 0; i < helper.length; i++) {
			System.out.print(helper[i]);
		}
		System.out.println();
	}

}
