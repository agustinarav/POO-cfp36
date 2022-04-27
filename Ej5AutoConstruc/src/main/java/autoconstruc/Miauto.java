
package autoconstruc;
import java.util.Scanner;
public class Miauto {
    // atributos de la clase Autoconstruc
		String marca, modelo;
		int kilometraje; 
		Scanner entrada = new Scanner(System.in);
	
		  // metodo construc
		  public Miauto () {
			  
		  System.out.print("----- Ingrese los datos del auto ----- \n ");
		  
		  System.out.print("Ingrese marca:");
		  this.marca = entrada.nextLine(); 		 
		  
		  System.out.print("Ingrese modelo:");
		  this.modelo = entrada.nextLine(); 
	
		  
		  System.out.print("Ingrese kilometraje del auto:");
		  this.kilometraje = entrada.nextInt(); 
		
		  
	
		  }
	
}
