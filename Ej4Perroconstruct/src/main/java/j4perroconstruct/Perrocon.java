package j4perroconstruct;
import java.util.Scanner;
public class Perrocon {
    // atributos de la clase Perros
		  String nombre, raza, color; 
		  int edad; 
		  Scanner entrada = new Scanner(System.in);
	
	
		  // metodo construc
		  public Perrocon () {
			  
		  System.out.print("Ingrese el Nombre del Perro:");
		  this.nombre = entrada.nextLine(); 
		  System.out.print("El nombre del perro es ");
		  
		  }
}
