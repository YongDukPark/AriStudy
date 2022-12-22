package chapter10_AWT;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardTest {
    public static void main(String[] args) {
        //기본적인 Frame 컨테이너를 생성한다.
        Frame f = new Frame("CardLayout");
        //Layout 관리자를 만든다.
        CardLayout card = new CardLayout();
        //Frame 컨테이너에 Layout을 입혀준다.
        f.setLayout(card);
        //Button 인스턴스들을 생성
        Button b1 = new Button("날 바꿔1");
        Button b2 = new Button("날 바꿔2");
        Button b3 = new Button("날 바꿔3");
        //x기능 추가
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        //패널을 만들어준다. background는 red 그리고 패널에 버튼을 넣어준다 x3
        Panel p1 = new Panel();
        p1.setBackground(Color.red);
        p1.add(b1);
        Panel p2 = new Panel();
        p2.setBackground(Color.blue);
        p2.add(b2);
        Panel p3 = new Panel();
        p3.setBackground(Color.orange);
        p3.add(b3);
        
        //Frame 컨테이너에 Panel 컨테이너를 넣고 이름을 부여해준다.
        f.add(p1, "1");
        f.add(p2, "2");
        f.add(p3, "3");
        
        //Frame에 사이즈를 지정해주고 실행해주는 method를 넣는다.
        f.setSize(300,200);
        f.setVisible(true);
        
        //card 를 보여지는 역활을 한다. f프레임에 1을 show하라
        card.show(f, "1");
        
        //이 for문들은 단순히 시간 지체용도이다.
        for(double i = 0.01 ; i < 9999999 ; ){i+=0.01;}
        card.show(f, "2");
        
        for(double i = 0.01 ; i < 9999999 ; ){i+=0.01;}
        card.show(f, "3");
    }
}
