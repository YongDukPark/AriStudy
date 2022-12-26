package chapter11;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldEvent implements ActionListener{
    Frame frame;
    TextField nameField;
    
    TextFieldEvent(){
        frame = new Frame("TextField Event");
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        //15자리까지 들어가는 텍스트 필드 생성
        nameField = new TextField(15);
        //여기서 들어가는 this는 이 클래스 자체라는 의미의 this이다
        //버튼이벤트 등록
        nameField.addActionListener(this);
        
        frame.setLayout(new FlowLayout());
        frame.add(new Label("이름", Label.RIGHT));
        frame.add(nameField);
        
        frame.setSize(300,70);
        frame.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        String inputString = nameField.getText();
        nameField.setText("");
        anotherFrame(inputString);
    }
    
    public void anotherFrame(String inputName){
        Frame frame1 = new Frame("Another Frame");
        
        frame1.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        frame1.setLayout(new FlowLayout());
        frame1.add(new Label(inputName + "님 안녕하세요", Label.CENTER));
        frame1.setLocation(400, 0);
        frame1.setSize(400,70);
        frame1.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        TextFieldEvent tf = new TextFieldEvent();
    }
    
}
