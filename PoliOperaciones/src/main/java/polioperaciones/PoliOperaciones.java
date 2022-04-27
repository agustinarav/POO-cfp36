
package polioperaciones;
public class PoliOperaciones {

    public static void main(String[] args) {
      		System.out.print("Ingrese valores de Suma \n ");
				
		        Operaciones suma = new Suma();
		        suma.PedriDatos();
		        suma.operaciones();
		        suma.Mostrarresultado();
		        
		        
		        System.out.println ("Ingrese valores de Resta");
		        
		        Operaciones resta = new Resta();
		        resta.PedriDatos();
		        resta.operaciones();
		        resta.Mostrarresultado();
		    
		    
		        
		        System.out.println ("Ingrese valores de Multiplicación");
		        
		        Operaciones multi = new Multi();
		        multi.PedriDatos();
		        multi.operaciones();
		        multi.Mostrarresultado();
		        
		        
		    
		        System.out.println ("Ingrese valores de División ");
		        
		        Operaciones divi = new Div();
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
