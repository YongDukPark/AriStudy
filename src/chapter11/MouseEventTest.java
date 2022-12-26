package chapter11;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseEventTest implements MouseListener{
    Frame f;
    Button b;
    
    public MouseEventTest(){
        f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        f.setLayout(null);
        
        b = new Button("BUTTON");
        
        b.addMouseListener(this);
        b.setSize(125, 50);
        b.setLocation(100, 75);
        
        f.add(b);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //마우스가 해당 컴포넌트 클릭했을때
        b.setLabel("Mouse Clicked");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //마우스 올라가있는 상태
        b.setLabel("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //마우스 나간상태
        b.setLabel("Mouse Exited");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //마우스 누르고 있는 상태
        b.setLabel("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //마우스를 놓을때 발생
        b.setLabel("Mouse Released");
    }
    
    public static void main(String[] args) {
        MouseEventTest met = new MouseEventTest();
    }
}
