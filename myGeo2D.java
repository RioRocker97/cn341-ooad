import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class myGeo2D extends Frame{
    public myGeo2D(){
      super("My Geometry");
      prepareGUI();
   }

   public static void main(String[] args){
      myGeo2D  mywindow = new myGeo2D();  
      mywindow.setVisible(true);
   }

   private void prepareGUI(){
      setSize(852,480);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      Graphics2D g2 = (Graphics2D)g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
         RenderingHints.VALUE_ANTIALIAS_ON);
      Font font = new Font("tahoma", Font.PLAIN, 24);
      g2.setFont(font);
      g2.drawString("This is my grometry",250,70);
      g2.draw(new Line2D.Double(50, 50, 300, 400)); 
      g2.draw(new Rectangle2D.Double(150,80,100,50));
      g2.setPaint(Color.BLUE);
      g2.fill (new Ellipse2D.Double(300, 80, 150, 80));
       g2.setPaint(Color.RED);
      g2.fill (new Rectangle2D.Double(200,150,100,100));
      g2.setPaint(Color.BLACK);
      font = new Font("printable4u", Font.PLAIN, 18);
      g2.setFont(font);
      g2.drawString("Created by",500,200);
      g2.drawString("5910613248 Thatchadet Chirabunyadej",500,250);
      g2.drawString("5910613305 Boonnat Phuengyamsawal",500,300);
      g2.drawString("6010613518 Kasin Yamsri",500,350);
   }
}