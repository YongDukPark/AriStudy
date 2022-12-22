package chapter10_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridTest {
    public static void main(String[] args) {
        Frame f = new Frame("나는야 GridLayout");
        Button b1, b2, b3, b4;
        
        b1 = new Button("이쁜버튼1");
        b2 = new Button("이쁜버튼2");
        b3 = new Button("이쁜버튼3");
        b4 = new Button("이쁜버튼4");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Panel p = new Panel();
        
        //2x2 형태로 그리드 레이아웃을 생성하겠다는 뜻이다.
        //p.setLayout(new GridLayout(2,2));
        //이거는 2x2 에 간격은 10px씩 떨어트리겠다는 뜻이다.
        p.setLayout(new GridLayout(2,2,10,10));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        
        f.add(p, "Center");
        
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
