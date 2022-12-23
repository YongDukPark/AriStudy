package chapter10_AWT;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest {
    public static void main(String[] args) {
        Frame f = new Frame("프레임");
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Dialog d = new Dialog(f, "메시지 창", true);
        d.setSize(140, 100);
        d.setLocation(50, 50);
        d.setLayout(new FlowLayout());
        
        Label l = new Label("버튼을 클릭하세요", Label.CENTER);
        Button b = new Button("확인");
//        만약 x를 누르게 되면 상단에 Frame까지 다 닫히게 된다.
//        d.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e){
//                System.exit(0);
//            }
//        });
        d.add(l);
        d.add(b);
        
        f.setSize(300, 200);
        f.setVisible(true);
        d.setVisible(true);
    }
}
