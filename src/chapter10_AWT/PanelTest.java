package chapter10_AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PanelTest {
    public static void main(String[] args) {
        Frame f = new Frame("Panel Test");
        Panel p = new Panel();
        
        f.addWindowListener( new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                //여기 이벤트를 진행시키면 창이 닫힌다.
                System.exit(0);
            }
        });
        //기본 레이아웃 관리자를 취소하는 명령문이다.
        //이처리를 안하면 배경 전부가 Panel 색상으로 나올것이다.
        f.setLayout(null);
        
        //백그라운드 색상 지정이다. 두개다 동일하다.
        f.setBackground(Color.yellow);
        p.setBackground(Color.BLUE);
        
        //가로 x 세로 크기이다. 패널이나 프레임이나 그게 그거다.
        f.setSize(300,200);
        p.setSize(100, 100);
        
        //프레임의 생성 위치를 지정해준다.
        f.setLocation(100, 100);
        //이건 당연히 패널의 생성 위치를 지정해준다.
        p.setLocation(30, 50);
        
        //이거를 통해 패널을 프레임에 추가할수 있다.
        f.add(p);
        //요놈으로 프레임 출력
        f.setVisible(true);
    }
}
