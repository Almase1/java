package ejercicios1;

public class Parentesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		// Preferencias de los operadores
		
		
		double calculo=10+20-30;  //10+20=30    30-30=0
		System.out.println(calculo);
		
		calculo=10+20*30;  // 20*30=600   600+10=610
		System.out.println(calculo);
		
		calculo=(10+20)*30;  // (10+20)=30  30*30=900
		System.out.println(calculo);
		
		calculo=7+3*2-5;  
		System.out.println(calculo);
		
		calculo=(7+3)*2-5;  
		System.out.println(calculo);
		
		calculo=7+3*(2-5); 
		System.out.println(calculo);
		
		double precio_neto=1000-1000-21/100;
		System.out.println(precio_neto);

		precio_neto=1000-(1000*21/100);
		System.out.println(precio_neto);
			
		
	}

}
