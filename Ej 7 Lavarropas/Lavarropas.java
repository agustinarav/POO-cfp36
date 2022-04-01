import java.util.Scanner;
public class Lavarropas {

	String marca, modelo, TipoRopa;
	Float KilosDeLavado; 
	
	
	public void TipodeRopa  () {
		
		 Scanner entrada = new Scanner(System.in);
		 System.out.print
		 		("Ingrese tipo de ropa:\n" + 
		 		"1_Lana\r\n" + 
		 		"2_Ropa Sucia\r\n" + 
		 		"3_Económico\r\n" + 
		 		"4_Ropa de Bebé\n"+
		 		 ">>>> Respuesta >>>>\n ");
		 
		 int Nropa= Integer.parseInt (entrada.nextLine ());
		
	         
	       
	        switch (Nropa) 
	        {
	        
	        	case 1:  System.out.println ("Lana");
	        			 break;
	        	
	            case 2:  System.out.println ("Ropa Sucia");
	                     break;
	                     
	            case 3:  System.out.println ("Economico");
	                     break;
	                     
	            case 4:  System.out.println ("Ropa de Bebe");
	                     break;
	         
	        }
	        
	      
		 
		 
		 
		
	}
	
	
}
