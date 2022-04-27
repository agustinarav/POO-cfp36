
// Primer Ejercicio de Herencia 

package operaciones;
public class Ej12Operaciones {

    public static void main(String[] args) {
 		
		        Suma suma = new Suma ();
                        
                        System.out.println("Ingrese valores de la suma "); 
		        suma.PedirDatos();
		        suma.Sumar ();
		        suma.VerResultado();
		        
		        Resta resta = new Resta ();
                        System.out.println("Ingrese valores de la resta "); 
		        resta.PedirDatos();
		        resta.Restar ();
		        resta.VerResultado();
		        
		 
		    }
	
        
        
 }
