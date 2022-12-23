package chapter10_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonTest {
    public static void main(String[] args) {
        Frame f = new Frame("나는야 멋쟁이 프레임");
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Button b1 = new Button("계속");
        //width, height
        b1.setSize(60,30);
        //x, y 위치로 추정
        b1.setLocation(120, 40);
        Button b2 = new Button("중단");
        b2.setSize(60,30);
        b2.setLocation(120, 80);
        
        f.add(b1);
        f.add(b2);
        
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
