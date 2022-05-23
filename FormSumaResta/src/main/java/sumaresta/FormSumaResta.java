package sumaresta;
import javax.swing.*;
import java.awt.event.*;


public class FormSumaResta extends JFrame implements ActionListener {

    private JButton botonSuma, botonResta ;
    private JLabel label1, label2, label3;
    private JTextField Texto1, Texto2, Texto3;
    
    
    
    
     
    public FormSumaResta (){
        setLayout(null);
    
     
        botonSuma = new JButton("Sumar");
        botonSuma.setBounds(80,80,100,30);
        add (botonSuma);
        botonSuma.addActionListener(this);

        botonResta = new JButton("Resta");
        botonResta.setBounds(200,80,100,30);
        add(botonResta);
        botonResta.addActionListener(this);

    
    
        label1 = new JLabel("Valor 1");
        label1.setBounds(80,5,200,30);
        add(label1);
         
        label2 = new JLabel("Valor 2");
        label2.setBounds(80,35,200,30);
        add(label2);
    
        label3 = new JLabel("Resultado");
        label3.setBounds(145,120,300,30);
        add(label3);
        
        
        
        Texto1 = new JTextField();
        Texto1.setBounds(150,10,150,20);
        add(Texto1);

        Texto2 = new JTextField();
        Texto2.setBounds(150,40,150,20);
        add(Texto2);
        
        
       }
    
    
    
    
    public void actionPerformed(ActionEvent e){
    if(e.getSource() ==   botonSuma ) {
        
        
        int valor1= 0 , valor2=0, resultado=0 ; 
        
        valor1= Integer.parseInt( Texto1.getText ()); 
        valor2= Integer.parseInt( Texto2.getText ()); 
        
        resultado = valor1 + valor2; 
        label3.setText ("Resultado:  " + resultado ); 
      
    }
    
    else if(e.getSource() ==   botonResta){
        
      int valor1= 0 , valor2=0, resultado=0 ; 
        
        valor1= Integer.parseInt( Texto1.getText ()); 
        valor2= Integer.parseInt( Texto2.getText ()); 
        
        resultado = valor1 - valor2; 
         label3.setText ("Resultado:  " + resultado ); 
        
    }
    
   }
    
    
    
    
    
  public static void main(String[] args) {
        FormSumaResta form = new FormSumaResta ();
        form.setBounds(0,0,400,220);
        
        //HOR / VERT
        
        form.setVisible(true);
        form.setResizable(false);
        form.setLocationRelativeTo(null);
        form.setTitle("Operaciones");
    }
  

}
