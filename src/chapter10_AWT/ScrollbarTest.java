package chapter10_AWT;

import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScrollbarTest {
    public static void main(String[] args) {
        Frame f = new Frame("Scrollbar");
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
       
        Scrollbar ver = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
        ver.setSize(20, 150);
        ver.setLocation(30, 30);
        
        Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 100);
        hor.setSize(150, 20);
        hor.setLocation(120, 60);
        
        f.add(ver);
        f.add(hor);
        
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
