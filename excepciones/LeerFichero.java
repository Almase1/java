package excepciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		
		File fichero= new File("/tmp/prueba.txt");
		//File fichero1= new File("C:\\temporal\\fichero.txt");

		try {
			//Abro el fichero para Leer
			FileReader fr= new FileReader(fichero);
			
			//Buffer para ir cargando las líneas del fichero
			BufferedReader br=new BufferedReader(fr);
			
			String linea;
			
			//Leer una linea del fichero
			//Si linea==null he llegado al final del fichero
			linea=br.readLine();
			
			//mientras haya líneas, es decir mientras NO sea igual a NULL
			while ( linea !=null)
			{
				System.out.println(linea);
				linea=br.readLine();
			}
			//Cierro el fichero
		    fr.close();	
		} catch (FileNotFoundException e) {
						
			System.out.println("No he podido abrir el fichero");
		}
		 catch (IOException e) {
			 System.out.println("Error al intentar leer una linea");
		}
		
		System.out.println("HE TERMINADO LA LECTURA");
		
	}

}
