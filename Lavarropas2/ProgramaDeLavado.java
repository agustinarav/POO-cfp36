public class ProgramaDeLavado {
	private int _tipoLavado;

	public ProgramaDeLavado(int tipoLavado) {
		// asigna la variable interna
		_tipoLavado = tipoLavado;
	}

	public void realizarLavado() {
	
		// se muestra el tipo de lavado
		switch (this._tipoLavado)
     	{	    	 
		 	case 1:  
		 		lavado("Lana", "Suave");
			  	break;	    		 
         	case 2: 
		 		lavado("Ropa sucia", "Profundo");
              	break;	                 	 
         	case 3: 
		 		lavado("Lavado ECO", "Normal");
              	break;	                 	 
         	case 4: 
		 		lavado("Ropa de bebé", "Suave");
              	break;
         	default:
         		System.out.println("No existe el programa seleccionado");
         		break;
     	}

		// secado de la ropa
		secado();
	}

	private void lavado (String tipoDeRopa, String tipoDeLavado) {
		System.out.println ("El tipo de lavado es " + " " + tipoDeLavado + ", " + tipoDeRopa);
	}

	private void secado() {		
		System.out.println ("Se está secando la ropa");
	}
	

}