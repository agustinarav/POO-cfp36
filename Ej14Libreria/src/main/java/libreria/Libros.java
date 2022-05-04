package libreria;
public class Libros {
    
    
    private String titulo;
    private String autor;
    private int numTomos;
    private int prestados;
    private int disponibles;     
    private int respuestapresta; 
    private int devueltos; 
    private int respuesta; 
    private int newDisponibles;

    //constructor por defecto
    public Libros () {
    }


    public Libros (String titulo, String autor, int numTomos, int prestados  ) {                                    
    this.titulo = titulo;
    this.autor = autor;
    this.numTomos = numTomos;
    this.prestados = prestados;
  
    }

    
    
   // public void devueltos (){
    
     
    
    
    //getters y setters
    
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
     public String getTitulo() {
        return titulo;
    }

     public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

   
    public void setNumTomos(int numTomos) {
        this.numTomos  = numTomos;
    }
    
    public int getNumTomos() {
        return numTomos ;
    }

    
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }


    public int getPrestados() {
        return prestados;
    }


   
    
    
    public void setDevueltos (int devueltos) {
        this.devueltos = devueltos ;
        
    }


    public int getDevueltos() {
        
       disponibles = disponibles + devueltos ;   
              
        return disponibles ; 
    }
    
    
    
    
     public void setDisponibles (int disponibles ) {
        this.disponibles = disponibles ;
         
    }

    
    
    public int getDisponibles () {
        
    disponibles = numTomos - prestados;     
    
    return disponibles; 
        
    }

     
    public int getNewDisponibles () {
        
    newDisponibles = (numTomos - prestados) - prestados ;     
    
    return newDisponibles; 
        
    }
    
    //metodo prestamo libro
    public boolean prestamo() {
        boolean prestado = true;
        if (respuestapresta < numTomos ) {
            
        } else {
            prestado = false;
        }
        return prestado;
    }

    //metodo devolucion libro
    public boolean devolucion() {
        boolean devuelto = true;
        if (respuestapresta >= 0 ) {
           
                                               
        } else {
            devuelto = false;
        }
        
        return devuelto;
    }

    
    
    
    
    //método toString para mostrar los datos 
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAutor: " + autor +
                  "\nNumero de tomos totales : " + numTomos  + "\nPrestados: " + prestados ;                                    
    }
    
    
    
    }
    
