import java.util.Scanner;
public class Cuenta {
	
	
	String  nombreTitular, tipoDeCuenta;
	int saldo;
	int saldoextraer;
	int saldototal;
	
	public Cuenta () {
	 saldo = 5000; 

	
	}
	
	public void Extraer () {
		
		 Scanner entrada = new Scanner(System.in);
		 
		 System.out.print("Ingrese Nombre del titular:");
		 nombreTitular = entrada.nextLine ();
		  
		  
		 System.out.print("Ingrese Caja de Ahorro Pesos/USD:");
		 tipoDeCuenta= entrada.nextLine ();
		  
		 
		  System.out.print("Ingrese saldo a extraer:");
		  saldoextraer = entrada.nextInt ();
		
		  if (saldoextraer > 5000) { 		    
				
				System.out.println(saldo + "Usted no tiene saldo suficiente para extraer dinero");
			   
			    
			}   
		  
		  
		  
		  else { saldototal = saldo-saldoextraer ; 
		  
			  
			  
			  
			  System.out.println(				 
					
					"--------" + "Nombre del Titular: " + nombreTitular + "--------\n" + "--------"+ "Tipo de cuenta: " +  tipoDeCuenta + "-------- \n" +
					"Su saldo actual es de " + saldototal + "\n"+ "Saldo exteraído " + saldoextraer );	
			 			
		  		}  
 
	
		  
	} 
	
}  