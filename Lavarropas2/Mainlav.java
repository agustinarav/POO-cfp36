

import java.util.Scanner;

public class Mainlav {

	public static void main(String[] args) {
		// se genera el scanner
		Scanner entrada = new Scanner(System.in);

		// se solicita tipo de lavado
		System.out.print
	     	 ("Ingrese tipo de ropa:\n" +
	     	 "1_Lana\r\n" +
	     	 "2_Ropa Sucia\r\n" +
	     	 "3_Económico\r\n" +
	     	 "4_Ropa de Bebé\n"+
	     	  ">>>> Respuesta >>>>\n ");
		int tipoLavado = entrada.nextInt();
		
		// se solicita cant de kilos
		System.out.print("Ingrese cantidad de kilos:\n");
		int cantKilos = entrada.nextInt();

		Lavarropas lavarropas = new Lavarropas(tipoLavado, cantKilos);
		lavarropas.ProcesoDeLavado();
	}

}


