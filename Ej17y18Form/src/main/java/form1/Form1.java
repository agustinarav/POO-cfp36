package form1;
import java.awt.Font;
import javax.swing.*; 
        
        
        
public class Form1 extends JFrame {
    private JLabel eti1; 
    
    
    public Form1 () {
        
        //indica con coordenads donde se quieren colocar los elementos 
        setLayout(null);
        
        //eti1.setFont(new Font("Tahoma", Font.PLAIN, 17));
        
        // mensaje de etiqueta
        eti1 = new JLabel("Hola :)");              
        
        //ubiacion x, y, ancho, alto, 
        eti1.setBounds(0, 0, 500, 300);
        eti1.setHorizontalAlignment(JLabel.CENTER);
        add (eti1); 
    
}

    public static void main(String args []) {
        
        Form1 formulario  = new Form1 (); 
        
        //tamaño
        formulario.setBounds(0, 0, 500, 300);
            
        //hacer visible el formulario
        formulario.setVisible(true);
        //Centrar formulario 
        formulario.setLocationRelativeTo(null);
        //permitir la edición del tamaño
        formulario.setResizable(false);
        //definir el titulo del formulario
        formulario.setTitle("Saludo");
        
        
    }
}
