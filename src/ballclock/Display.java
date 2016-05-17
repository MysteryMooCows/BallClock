/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballclock;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

/**
 *
 * @author rodjm_000
 */
public class Display extends Frame {
       
   public Display() {
      super(BallClock.getWindowTitle());
      prepareGUI();
   }

   private void prepareGUI(){
      setSize(400,400);
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      }); 
   }    

   @Override
   public void paint(Graphics g) {
      g.setColor(Color.GRAY);
      Font font = new Font("Serif", Font.PLAIN, 24);
      g.setFont(font);
      g.drawString("This will be a ball clock", 50, 150);      
   }
}