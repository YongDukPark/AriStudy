package chapter10_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NoLayout {
    public static void main(String[] args) {
        Frame f;
        Button b1, b2, b3;
        
        //Frame 생성 및 title 설정
        f = new Frame("나는야 멋쟁이 컴포넌트 배치");
        //버튼들 객체 생성 및 버튼 title 설정
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        //x누를경우 종료되게 설정
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        //Layout null로 초기화
        f.setLayout(null);
        //Button 위치 지정 가로세로(가로에서 떨어진 길이, 위에서 밑으로 길이), 크기(가로,세로)
        b1.setBounds(50, 55, 100, 50);
        b2.setBounds(180, 50, 100, 50);
        b3.setBounds(310, 90, 100, 50);
        
        //Frame에 버튼 추가
        f.add(b1);
        f.add(b2);
        f.add(b3);
        
        //Frame 크기 지정
        f.setSize(460, 150);
        //Frame 출력
        f.setVisible(true);
    }
}
