package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class LeerFichero2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		//Pedir el nombre del fichero por teclado
		System.out.println("Introduce/tmp/ el nombre de un fichero:");
		String fichero=teclado.next();
		int contador=0;
		int letras=0;
		
		
		//Asociar el fichero
		File f1=new File(fichero);
		
		try {
			FileReader fr= new FileReader(f1);
			String linea;
			BufferedReader br= new BufferedReader(fr);
			
			linea=br.readLine();
			while (linea != null)
			{
				contador=contador+1;
				System.out.println(linea+"--> mide "+linea.length());
				letras=letras+linea.length()+1;
				linea=br.readLine();
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Se ha producido al gun error");
		}
			System.out.println("He leido "+contador+" lineas y he leido "+letras+" letras");	

	}

}
