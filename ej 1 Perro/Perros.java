import java.util.Scanner;
public class Perros {

	// atributos de la clase Perros
	  String nombre, raza, color; 
	  int edad; 
	  Scanner entrada = new Scanner(System.in);
	    
	    
	  // metodo 
	  public void Pedir(){
	  System.out.print("Ingrese el Nombre del Perro:");
	  nombre = entrada.nextLine();
	  System.out.print("Ingrese el Raza del Perro:");
	  raza = entrada.nextLine();
	  System.out.print("Ingrese el Color del Perro:");
	  color = entrada.nextLine();
	  System.out.print("Ingrese el Edad del Perro:");
	  edad = entrada.nextInt();

	  }
	    
	  //metodo ladrar
	  public void Ladrar(){
	  System.out.println("GUAU GUAU");
	  
	    }
	  
	  
	  public void Ficha(){
	  System.out.println("---------------Veterinaria CFP36-------------------");
	  System.out.println("---------------Nombre:"+ nombre + "---");
	  System.out.println("----------------Raza:"  + raza + "---");
	  System.out.println("----------------Color:" + color + "---");
	   System.out.println("----------------Color:" + edad + "---");
	  System.out.println("-----------------------------------------------------");
	  }
	
	
	
	
	
}
