package ej2auto;
import java.util.Scanner;
public class Auto {
	
	//atributos auto 
	String marca, modelo;
	int kilometraje; 
	
	
	//metodo 
	public void estadoAuto() {
		 Scanner entrada = new Scanner(System.in);
		  System.out.print("Ingrese el kilometraje del auto:");
		  kilometraje = entrada.nextInt ();
		
		
		if (kilometraje == 0) {
		  
		    System.out.println(kilometraje + "Km Auto" + "El auto está nuevo");
		    
		    
		} else if (kilometraje < 10000 ) {		    
		    System.out.println(kilometraje + "Km Auto" + " El auto está poco usado");
		    
		} else if (kilometraje >= 10000) {
			   System.out.println(kilometraje + "Km Auto" + " El auto está usado");
			   
			   
		} else if (kilometraje >= 10500)
			 System.out.println(kilometraje + "Km Auto" + " El auto está bastante usado"); }
				  
		}
		        
		
		
		
		

	


