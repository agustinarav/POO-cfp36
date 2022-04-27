package encapsulamientodos;
import java.util.Scanner;
public class CuentaEnc {
    
        private String  nombreTitular, tipoDeCuenta;
	private int _saldo;
	private int _saldoextraer;
	private int _saldototal;
	
        
        
        // setter ingresar saldo 
	public void CuentaEnc (int saldo_cuenta) {
	 _saldo = saldo_cuenta; 

	        
	}
	
	public void Extraer () {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Ingrese Nombre del titular:");
		 nombreTitular = entrada.nextLine ();
		  
		  
		 System.out.print("Ingrese Caja de Ahorro Pesos/USD:");
		 tipoDeCuenta= entrada.nextLine ();
		  
		 
		  System.out.print("Ingrese saldo a extraer:");
		  _saldoextraer = entrada.nextInt ();
		
		  if (_saldoextraer > _saldo) { 		    
				
				System.out.println("Usted no tiene saldo suficiente para extraer dinero");
			   
			    
			}   
		  
		  
		  
		  else { _saldototal = _saldo-_saldoextraer ; 
		  
			  
			  
			  
			  System.out.println(				 
					
					"--------" + "Nombre del Titular: " + nombreTitular +
                                        "--------\n" + "--------"+ "Tipo de cuenta: " + 
                                        tipoDeCuenta + "-------- \n" +                                                
					"Su saldo actual es de " + _saldototal + "\n"+ 
                                        "Saldo exteraído " + _saldoextraer );	
			 			
		  		}  
 
	
		  
	} 
    
    
    
    
}
