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
        //�׷� �̰� ��ﳵ�� �̷������� �̻��� �̸����� �Ǿ��־���.
        if(me.getModifiers() == me.BUTTON3_MASK){
            
            textField.setText(new String("������ ���콺 ��ư Ŭ��"));
            
            System.out.println(me.getModifiers());
            //4��� me.BUTTON3_MASK�� 4�� ��µȴ� 4=4 �̹Ƿ� ���� ���ǹ��� ���´�.
            System.out.println(me.BUTTON3_MASK);
            
        } else if(me.getModifiers() == me.BUTTON1_MASK){
            textField.setText("���� ���콺 ��ư Ŭ��");
            System.out.println(me.getModifiers());
            //16���
        }
    }
    
    public static void main(String[] args) {
        RightClick rc = new RightClick();
    }
}
