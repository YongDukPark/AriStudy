package chapter10_AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.*;

public class FrameTest {
    public static void main(String[] args) {
        //여기서 생성자로 보내는 text는 타이틀 바에 표시될 제목이다.
        //Frame f = new Frame("나는야 멋쟁이 Frame");
        Frame f = new Frame();
        //이런식으로도 title설정이 가능하다.
        f.setTitle("나는야 멋쟁이 Frame");
        //위에서 set 진행한 Title명을 출력할수 있다.
        System.out.println(f.getTitle());
        
        //자 이벤트를 추가하는 메서드를 생성해 준다.
        f.addWindowListener( new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                //여기 이벤트를 진행시키면 창이 닫힌다.
                System.exit(0);
            }
        });
        //프레임의 사이즈를 지정한다.
        f.setSize(300, 300);
        //프레임의 생성 위치를 지정해준다.
        f.setLocation(100, 100);
        //프레임의 배경색상을 지정한다.
        f.setBackground(Color.yellow);
        //프레임을 표시한다.
        f.setVisible(true);
    }
}
