package operaciones;
import java.util.Scanner;
public class Ope {
    
       protected int valor1, valor2, resultado;
	    Scanner entrada = new Scanner(System.in);
	    
	    //Este método pide los valores al usuario
	    public void PedirDatos(){
	        System.out.print("Ingrese el primer valor : ");
	        valor1 = entrada.nextInt();
	        System.out.print("Ingrese el segundo valor:") ; 
	        valor2 = entrada.nextInt();
	        
	        
	    }
	    //este método muestra el resultado
	    public void VerResultado(){
	        System.out.println("El resultado es  " + resultado);
	            
	    }
    
    
}
