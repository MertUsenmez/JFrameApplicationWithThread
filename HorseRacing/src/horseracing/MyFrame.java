
package horseracing;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class MyFrame extends Frame {

    public MyFrame() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
        setLayout(null);
         
        JPanel jp = new JPanel();
        jp.setSize(1100,600);
        jp.setLocation( 0, 0);
        
        
        JLabel bg =new  JLabel();
        JLabel l1 =new  JLabel();
        JLabel l2 =new JLabel();
        bg.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\HorseRacing\\build\\classes\\horseracing\\racetrack.png"));
        l1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\HorseRacing\\build\\classes\\horseracing\\horse_icon.png"));
        l2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\HorseRacing\\build\\classes\\horseracing\\horse_icon.png"));
        
    
        add(bg);
        add(l1);
        add(l2);
        
        bg.setSize(1100, 600);
        l1.setSize(166, 97);
        l2.setSize(166, 97);
        bg.setLocation(0, 0);
        l1.setLocation(50, 150);
        l2.setLocation(50, 150);
        jp.add(bg);
        add(jp);
        
        Horse1 h1 = new Horse1(l1);
        h1.start();
        Horse2 h2 = new Horse2(l2);
        h2.start();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyFrame myframe = new MyFrame();
        myframe.setSize(1100, 600);
        myframe.setTitle("Horse racing");
        myframe.setVisible(true);
        myframe.setResizable(false);
    }
    
}
