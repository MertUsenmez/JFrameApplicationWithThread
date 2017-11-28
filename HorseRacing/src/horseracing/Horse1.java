/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horseracing;

import java.awt.Component;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Horse1 extends Thread{
    
    Component component;

    public Horse1(Component component) {
        this.component = component;
    }
    public void run(){
        Random ran = new Random();
        for (int i = 0; i < 90; i++) {
            
            component.setLocation(component.getX()+20, component.getY());
            try {
                Thread.sleep(ran.nextInt(1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Horse1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
