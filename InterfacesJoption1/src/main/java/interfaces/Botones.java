
package interfaces;


  import java.awt.event.*;
  import javax.swing.*;



  
public class Botones extends JFrame implements ActionListener {
    
    
    private JButton bot1,bot2,bot3,bot4;
    private JLabel etiqueta;
    private JTextField Texto;

    //Constructor
    public Botones (){
      setLayout(null);

      //crear botones
      bot1 = new JButton("Mostrar");
      bot1.setBounds(10,100,90,30);
      add(bot1);
      bot1.addActionListener(this);
      
      //mostrar texto
       Texto = new JTextField();
       Texto.setBounds(120,17,150,20);
       add(Texto);

      bot4 = new JButton("SALIR");
      bot4.setBounds(210,200,90,30);
      add(bot4);
      
      /*se anticipa que este boton va a tener una funcionaliad.
      ActionListener -> refiere a que se hara uso de la clase nombrada arriba
      this esta asociado a bot4         
      */
      
      bot4.addActionListener(this);
    

      //crear etiqueta
      etiqueta = new JLabel("Ingresa un dato");
      etiqueta.setBounds(10,10,300,30);
      add(etiqueta);

      
      
    }

    
    
   

    //este es el evento que quiero que realice el boton 
    //action event -> e (puede ser cualquier espacio en memoria), la e hace referencia a evento
   
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == bot1){
            JOptionPane.showMessageDialog(null, Texto );
         }
    
        else if (e.getSource() == bot4){
            System.exit (0); 
         }
        
        
        
    }

    
          
        
        
    }

        
         

        
  
    





    
    
    
    
