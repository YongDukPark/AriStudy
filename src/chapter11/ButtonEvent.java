package chapter11;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ButtonEvent {
    
    ButtonEvent(){
        Frame frame = new Frame();

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        //버튼 생성
        Button okButton = new Button("OK");
        //okButton에 actionListener기능을 넣어준다. 밑에 인스턴스가 실행되게
        okButton.addActionListener(new OkButtonEventHandler());
        
        frame.setLayout(new FlowLayout());
        //버튼 add해주기
        frame.add(okButton);
        
        frame.setSize(200,100);
        frame.setVisible(true);
    }
    class OkButtonEventHandler implements ActionListener{
        //@Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("buttonClick");
        }

    }
    
    public static void main(String[] args) {
        ButtonEvent be = new ButtonEvent();
    }
}

