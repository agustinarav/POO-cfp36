package saludo; 
import java.awt.event.*;
import javax.swing.*;


public class Saludo extends JFrame implements ActionListener{

     
    private JButton bot1,bot2; 
    private JLabel etiqueta;
    private JTextField Texto;

    
    
    public Saludo (){
    setLayout(null);

    
    
      //crear etiqueta
      etiqueta = new JLabel("Ingresa tu nombre");
      etiqueta.setBounds(10,10,300,30);
      add(etiqueta);
    
      
      //field de texto
      Texto = new JTextField();
      Texto.setBounds(120,17,150,20);
      add(Texto);
      
      //crear botones
      /*se anticipa que este boton va a tener una funcionaliad.
      ActionListener -> refiere a que se hara uso de la clase nombrada arriba
      this esta asociado al boton         
      */
      
      bot1 = new JButton("Mostrar");
      bot1.setBounds(10,100,90,30);
      add(bot1);
      bot1.addActionListener(this);
      
      bot2 = new JButton("SALIR");
      bot2.setBounds(210,200,90,30);
      add(bot2);
      bot2.addActionListener(this);
    

    }

    //este es el evento que quiero que realice el boton 
    //action event -> e (puede ser cualquier espacio en memoria), la e hace referencia a evento
   
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bot1){
                        
             JOptionPane.showMessageDialog(this, Texto, "Hola!", JOptionPane.PLAIN_MESSAGE);
            
         }
    
        else if (e.getSource() == bot2){
            System.exit (0); 
         }
        
        
        
    }
       
    public static void main(String[] args) {
        //creamos mi objeto
        Saludo form1  = new Saludo ();   
        
        form1.setBounds(0, 0,350,300);
        form1.setVisible(true);
        form1.setResizable(false);
        form1.setTitle("Boton grafico");
     
        
        
        
        
    }

    
    }

    
    
    
