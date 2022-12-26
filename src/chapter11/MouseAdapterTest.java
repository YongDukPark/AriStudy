package chapter11;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAdapterTest extends MouseAdapter{
    Frame f;
    Button b;
    
    public MouseAdapterTest(){
        f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        b = new Button("확인");
        b.addMouseListener(this);
        b.setSize(70, 30);
        b.setLocation(120, 80);
        
        f.add(b);
        f.setLayout(null);
        f.setSize(300,200);
        f.setBackground(Color.blue);
        f.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        f.setBackground(Color.red);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        f.setBackground(Color.blue);
    }
    
    public static void main(String[] args) {
        MouseAdapterTest mat = new MouseAdapterTest();
    }
}
