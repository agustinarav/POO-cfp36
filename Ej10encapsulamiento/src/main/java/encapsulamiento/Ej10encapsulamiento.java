package encapsulamiento;
public class Ej10encapsulamiento {

    public static void main(String[] args) {
      
		PerroEnc Uli = new PerroEnc ();

		System.out.println( Uli.dameDatosGenerales () );		
		Uli.dameEdad (3);
		System.out.println ( Uli.edadPerro ());
		
		System.out.print( Uli.ladrar () );
		
	}

        
        
        
    }

