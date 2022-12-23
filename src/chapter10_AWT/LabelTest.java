package chapter10_AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LabelTest {
    public static void main(String[] args) {
        Frame f = new Frame("나는야 멋쟁이프레임");
        f.setSize(300, 100);
        f.setLayout(null);
        
        Label l1 = new Label("address : ");
        //x, y, width, hight 순이다.    xy는 위치 width, hight는 길이다.
        l1.setBounds(50, 50, 40, 15);
        l1.setBackground(Color.yellow);
        
        Label l2 = new Label("age : ");
        l2.setBounds(50, 70, 40, 15);
        l2.setBackground(Color.green);
        
        f.add(l1);
        f.add(l2);
        
        f.setVisible(true);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
}
