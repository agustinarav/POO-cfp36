
public class ClaseMain {

	public static void main(String[] args) {
		
		
		
				System.out.print("Ingrese valores de Suma \n ");
				
		        OperacionP suma = new SumaH();
		        suma.PedriDatos();
		        suma.operaciones();
		        suma.Mostrarresultado();
		        
		        
		        System.out.println ("Ingrese valores de Resta");
		        
		        OperacionP resta = new RestaH();
		        resta.PedriDatos();
		        resta.operaciones();
		        resta.Mostrarresultado();
		    
		    
		        
		        System.out.println ("Ingrese valores de Multiplicación");
		        
		        OperacionP multi = new MultiH();
		        multi.PedriDatos();
		        multi.operaciones();
		        multi.Mostrarresultado();
		        
		        
		    
		        System.out.println ("Ingrese valores de División ");
		        
		        OperacionP divi = new DivH();
		        divi.PedriDatos();		     
		        
		        
			      while (  (divi.valor1 <= 0 && divi.valor2 <= 0 ) ||
			    		 (divi.valor1 > 0 && divi.valor2 <= 0 ) ||
		        		 (divi.valor1 <= 0 && divi.valor2 > 0 ) 
	        			
			    	  ) 
		    	   
		    		   
		    		   { System.out.println ("No se puede dividir por 0 o número negativos. Ingrese un valor válido  ");
	    		        divi.PedriDatos();}
		        
		       			if (divi.valor1 > 0 && divi.valor2 > 0 ) 
		       			divi.operaciones();
				        divi.Mostrarresultado();
		       				
		        
		   
		        
		    
		        
		    	}
		        
}
		       
		    
		
		     
		    
		
