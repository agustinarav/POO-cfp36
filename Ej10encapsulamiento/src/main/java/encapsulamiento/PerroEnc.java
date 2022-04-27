package encapsulamiento;
public class PerroEnc {
    
    // atributos de la clase Perros
	  private String _nombre, _raza, _color; 
	  private int _edad; 
	
	  
	  
	  public  PerroEnc() {
		  
		  
		  _nombre= "Uli";
	  	  _raza= "Beagle"; 
	  	  _color= "Blanco y marrón" ; 
	
	  }
	  
	  	    
	  // metodo getter Strings 
	  public String dameDatosGenerales() {
		  return "Nombre:"+ _nombre + "\n" + "Raza:" + _raza +
		          "\n" + "Color:" + _color  ;
	  }
		
	// setter 	  
	  public void dameEdad ( int edad_perro ) { 
		  
		  _edad= edad_perro; 
		  
	  }

	  
	  //metodo  getter 
	  public String edadPerro (){ 
		  
	  return ("La edad del perro es " + _edad );
	  }
	    
	  //metodo ladrar getter 
	  public String ladrar(){
	  return ("GUAU GUAU");
	  
	    }
    
    
    
}
