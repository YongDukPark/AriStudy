package chapter10_AWT;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFieldTest {
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
        
        TextField id = new TextField(10);
        TextField pwd = new TextField(10);
        pwd.setEchoChar('*');
        
        f.add(lid);
        f.add(id);
        f.add(lpwd);
        f.add(pwd);
        
        //여기 pack 친구는 컴포넌트들의 크기에 꼭 맞게 프레임의 크기를
        //설정하고, 프레임을 화면에 표시된다.
        f.pack();
        f.setVisible(true);
        
        //버전 문제인지 TextField 관련 사항들이 안된다.
        //되게되면 우리가 보통 알고있는 로그인창이 나온다.
        
        //해결 > 해결방법 class명 변경 원인 하단에 기재
        //내가 불러올 class랑 같은 이름을 써서 안된거다 .. 
        //ctrl + shift + i 를 눌러도 import가 안되던게 ...할필요가 없던거다.. 이미 해당 
        //class 이름으로 세팅이 되어있는데 그리고 위에 직접 쳐봐도 안되던 이유는 가장 가까운
        //클래스의 이름의 생성자를 생각해보면 원인이 보인다..
    }
}
