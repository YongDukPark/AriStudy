package chapter10_AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest {
    public static void main(String[] args) {
        Frame f = new Frame("FlowLayout");
        Button b1, b2, b3, b4, b5;
        
        //이쁜이 버튼들 만들어주기
        b1 = new Button("버튼1");
        b2 = new Button("버튼2");
        b3 = new Button("버튼3");
        b4 = new Button("버튼4");
        b5 = new Button("버튼5");
        
        //x기능 넣어주기
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        //판넬 생성하기
        Panel p = new Panel();
        //p에 버튼들 넣어주기
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        //f에 생성시키기 p를 center에
        f.add(p, "Center");
        
        //Frame에 size 셋팅하고 출력시키는 visible method
        f.setSize(400,100);
        f.setVisible(true);
    }
}
