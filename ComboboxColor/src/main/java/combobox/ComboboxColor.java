
package combobox;
import javax.swing.*;
import javax.swing.JComboBox;
import javax.swing.JPanel.*;
import java.awt.event.*;
import java.awt.Color; 


public class ComboboxColor extends JFrame implements ItemListener {

    private JComboBox combo1; 
    //private JPanel panel1;
    
    public ComboboxColor () { 
        setLayout(null);
       // iniciarComponentes ();
                
     
     
        
       String[] colores = {"", "Rojo", "Azul", "Verde", "Amarillo"};
       
      
         
       combo1 = new JComboBox (colores);
       combo1.setBounds(10,10,150,20);
       add (combo1);
       combo1.addItemListener(this);
        
        
    }
    
            
       //panel.setBounds(40,80,200,200);   

 
    /*public void iniciarComponentes () {

        JPanel panel=new JPanel();
        this.getContentPane().add (panel); 
        
         panel.setBackground(Color.green);  
        
        }
    
      */  
 
    
    
     public void itemStateChanged (ItemEvent e) {
    
        if(e.getSource() ==   combo1 ) {
        
            String seleccion = combo1.getSelectedItem().toString();
            setTitle (seleccion); 
 
            
            if ( seleccion ==  "Azul" ) {
            
            getContentPane().setBackground(Color.blue);
                        
            }
        
            else if ( seleccion ==  "Rojo" ) {
            
            getContentPane().setBackground(Color.red);
                        
            }
                  
            
            else if ( seleccion ==  "Verde" ) {
            
            getContentPane().setBackground(Color.green);
                        
            }
        
            else if ( seleccion ==  "Amarillo" ) {
            
            getContentPane().setBackground(Color.yellow);
                        
            }
            
            
            else if ( seleccion ==  "" ) {
            
            getContentPane().setBackground(Color.white);
            setTitle ("Colores"); 
            }  
        

     }
        
          }
        
 
    public static void main(String[] args) {
    ComboboxColor form = new ComboboxColor ();     
   
        
        //HOR / VERT
        form.setBounds(0,0,280,150);
        form.setVisible(true);
        form.setResizable(false);
        form.setLocationRelativeTo(null);           
        form.setTitle("Colores");
        form.getContentPane().setBackground(Color.white);
       
         //String seleccion = combo1.getSelectedItem().toString();
        //Integer.parseInt
         
       // int selColor = combo1.getSelectedIndex();
        //selcolor = Integer.parseInt(combo1.getSelectedItem().toString()); 
            
        
        
        
        //form.getContentPane().setBackground(Color.red);
        
        

}
            
}
