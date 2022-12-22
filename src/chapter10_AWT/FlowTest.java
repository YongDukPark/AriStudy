package chapter10_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout");
        Button b1, b2, b3, b4, b5;
        
        b1 = new Button("버튼1");
        b2 = new Button("버튼2");
        b3 = new Button("버튼3");
        b4 = new Button("버튼4");
        b5 = new Button("버튼5");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Panel p = new Panel();
        
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        
        f.add(p, "Center");
        
        f.setSize(400,100);
        f.setVisible(true);
    }
}
