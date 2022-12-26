package chapter11;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseMotionTest implements MouseMotionListener{
    Frame f;
    Label l;
    
    public MouseMotionTest(){
        f = new Frame("WindowEvent Test");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
        
        f.addMouseMotionListener(this);
        
        l = new Label("Mouse Position : ");
        l.setSize(200, 30);
        l.setLocation(50, 100);
        
        f.add(l);
        f.setLayout(null);
        f.setSize(300,200);
        f.setVisible(true);
    }

    @Override
    public void mouseDragged(MouseEvent me) {    }

    @Override
    public void mouseMoved(MouseEvent me) {
        l.setText("Mouse Moved Position : (" + me.getX() + "," + me.getY() + ")");
    }
    
    public static void main(String[] args) {
        MouseMotionTest mmt = new MouseMotionTest();
    }
}
