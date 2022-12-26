package chapter11;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class RightClick extends MouseAdapter{
    Frame frame;
    TextField textField;
    
    RightClick(){
        frame = new Frame("Mouse Event");
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        frame.addMouseListener(this);
        
        textField = new TextField(20);
        frame.add(textField, "South");
        
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    @Override
    public void mousePressed(MouseEvent me) {
        //그래 이거 기억났다 이런식으로 이상한 이름으로 되어있었다.
        if(me.getModifiers() == me.BUTTON3_MASK){
            
            textField.setText(new String("오른쪽 마우스 버튼 클릭"));
            
            System.out.println(me.getModifiers());
            //4출력 me.BUTTON3_MASK도 4가 출력된다 4=4 이므로 이쪽 조건문에 들어온다.
            System.out.println(me.BUTTON3_MASK);
            
        } else if(me.getModifiers() == me.BUTTON1_MASK){
            textField.setText("왼쪽 마우스 버튼 클릭");
            System.out.println(me.getModifiers());
            //16출력
        }
    }
    
    public static void main(String[] args) {
        RightClick rc = new RightClick();
    }
}
