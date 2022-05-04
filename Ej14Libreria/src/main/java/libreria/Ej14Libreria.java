package libreria;
import java.util.Scanner; 

public class Ej14Libreria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String titulo, autor ;
        int  respuestapresta, respuesta; 

      
       Libros libro = new Libros ("El quijote", "Cervantes", 5, 2 );
        
        
        System.out.print("Seleccione accion a realizar : \n1.Prestar / 2.Devolver\nRespuesta: ");
        respuesta = sc.nextInt();
    
        System.out.println( libro );
        
        if ( respuesta == 1) {
                System.out.println("Disponibles a la fecha: " + libro.getDisponibles () + "\n" );
                System.out.print("Ingrese numero de tomos a prestar: " ); 
                respuestapresta = sc.nextInt();

                libro.setPrestados (respuestapresta);

                
                System.out.println("\n--- Actualizacion --- ");
                System.out.print( libro.prestamo() + "\n" ); 
                
                System.out.println("Se ha prestado " + respuestapresta + " tomo(s)");
                
                System.out.println("Total de libros disponibles: " + libro.getNewDisponibles ()) ;
        
                
                /* NOTAS: getNewDisponibles reemplaza a getDisponibles 
                
                          Total de libros disponibles (5,2) 
                          • Con un valor menor funciona bien (?
                          • Si ingresas disponibles a la fecha (input 3) devuelve -1. 
                          • Con valores mayores devuelve negativos: "Total de libros disponibles: -3" 
                
                          Faltaría la sección de que no se puedan prestar libros no disponibles 
                
                */
                
                          
                
                
                
        } 
        
        else if ( respuesta == 2 ) {
                
                System.out.println("Disponibles a la fecha: " + libro.getDisponibles () + "\n" );
                System.out.print("Ingrese numero de tomos a devolver: " ); 
                respuestapresta = sc.nextInt();
                libro.setDevueltos (respuestapresta);
                  
               
                        
                System.out.println("\n--- Actualizacion --- ");
                System.out.print( libro.devolucion() + "\n" );        
         
              
               
                System.out.println("Se ha devuelto " + respuestapresta + " tomo(s)");
               
                System.out.println("Total de libros disponibles: " + libro.getDevueltos ());
                
               
                
                

                
                
                
                }
        
        
        
         
        
            
        }
        
       
}

