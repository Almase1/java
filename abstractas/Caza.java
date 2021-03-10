package abstractas;

public class Caza extends Avion {
	private String modelo;
	private int num_misiles;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getNum_misiles() {
		return num_misiles;
	}
	public void setNum_misiles(int num_misiles) {
		this.num_misiles = num_misiles;
	}
	
	private String disparar(int misiles)
	{
		return "He disparado "+misiles+" misiles";
	}
	@Override
	public String toString() {
		 return "Es un caza modelo "+getModelo()+" con una potencia de fuengo de "+getNum_misiles()+" misiles";
	}
	@Override
	public String repostar() {
		
		return "Reposto en tierra y en vuelo";
	}
	@Override
	public boolean equals(Object obj) {
		//Convertimos obj a Caza
		Caza caza2=(Caza) obj;
		
		if (this.getPotencia()== caza2.getPotencia()) {
			return true; 
		}
		else
		{
			return false;
		}
	}	
	
	
	
	
}
