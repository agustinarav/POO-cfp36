
import javax.swing.JInternalFrame;


public class InternalFrameImg extends JInternalFrame {
    
  private PanelImg pi = new PanelImg(); 
  
    
   public  InternalFrameImg () {
   
   setContentPane (pi); 

   
   }
    
   public void setImage (String nombreImagen ) {
      pi.setImage (nombreImagen); 
   
   }
}
