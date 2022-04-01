import java.util.Scanner;
public class AreaRectangulo {
	
	//atributos auto 
		
		int base ; 
		int altura ; 
		int resultado; 
	
		
		
		
		//metodo
		public void Area () {
			Scanner entrada = new Scanner(System.in);
			System.out.print( "Calcular área de un rectángulo " + "\n Ingrese base:");
			base = entrada.nextInt ();
		
		
			System.out.print( "Ingrese altura:");
			altura = entrada.nextInt ();
			
			resultado= base* altura; 
			System.out.print( "El resultado es:"+ resultado );

}

}