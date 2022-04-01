package construct;
import java.util.Scanner;
public class Perrosconstruc {

	// atributos de la clase Perros
		  String nombre, raza, color; 
		  int edad; 
		  Scanner entrada = new Scanner(System.in);
	
	
		  // metodo construc
		  public Perrosconstruc () {
			  
		  System.out.print("Ingrese el Nombre del Perro:");
		  this.nombre = entrada.nextLine(); 
		  System.out.print("El nombre del perro es ");
		  
		  }
	

}
