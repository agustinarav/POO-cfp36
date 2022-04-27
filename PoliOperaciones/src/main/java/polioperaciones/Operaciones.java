package polioperaciones;
import java.util.Scanner;
public abstract class Operaciones {
    
    
	    protected float valor1,valor2,resultado;
	    Scanner leer = new Scanner(System.in);
	    
	    public void PedriDatos(){
	        System.out.print("Dame el primer valor :");
	        valor1 = leer.nextFloat();
	        
	        System.out.print("Dame el segundo valor :");
	        valor2 = leer.nextFloat();
	    }
	    
	    
	    //Polimor > se tiene que repetir abstract en la clase
	    public abstract void operaciones ();
	    
	    public void Mostrarresultado(){
	        System.out.print("El resultado es : " + resultado + "\n \n");
	     }
    
    
    
}
