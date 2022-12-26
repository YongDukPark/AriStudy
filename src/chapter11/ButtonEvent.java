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

        Button okButton = new Button("OK");
        okButton.addActionListener(new OkButtonEventHandler());
        
        frame.setLayout(new FlowLayout());
        frame.add(okButton);
        
        frame.setSize(200,100);
        frame.setVisible(true);
    }
    class OkButtonEventHandler implements ActionListener{
        //@Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("버튼을 눌렀습니다.");
            System.out.println("1222");
        }

    }
    
    public static void main(String[] args) {
        ButtonEvent be = new ButtonEvent();
        
        System.out.println("test");
    }
}

