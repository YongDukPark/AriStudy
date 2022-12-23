package chapter10_AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextField {
    public static void main(String[] args) {
        Frame f = new Frame("로그인");
        f.setLayout(new FlowLayout());
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Label lid = new Label("ID", Label.RIGHT);
        Label lpwd = new Label("PWD", Label.RIGHT);
        
        TextField id = new TextField();
        TextField pwd = new TextField();
        
        f.add(lid);
        //f.add(id);
        f.add(lpwd);
        //f.add(pwd);
        
        //여기 pack 친구는 컴포넌트들의 크기에 꼭 맞게 프레임의 크기를
        //설정하고, 프레임을 화면에 표시된다.
        f.pack();
        f.setVisible(true);
        
        //버전 문제인지 TextField 관련 사항들이 안된다.
        //되게되면 우리가 보통 알고있는 로그인창이 나온다.
    }
}
