package ejerciciosBuclesArrays;

public class TablaMultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		
		//La variable i  ira de 1  a  10
		for(int i=1; i<=10;i++)
		{
			//Multiplicar el valor que tenga i en ese momento 10 veces por x
			for(x=0; x<=10; x++)
			{
				System.out.println(i+"x"+x+"="+i*x);
			}
			System.out.println();
		}

	}

}
