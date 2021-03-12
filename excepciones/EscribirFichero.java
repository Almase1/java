package excepciones;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirFichero {

	public static void main(String[] args)  {
		
		try {
			FileWriter fichero=new FileWriter("/tmp/f1.txt");
			PrintWriter pw1=new PrintWriter(fichero);
			for (int x=0;x<100;x++) {
				pw1.println("He escrito la linea "+x);
			}
			fichero.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
