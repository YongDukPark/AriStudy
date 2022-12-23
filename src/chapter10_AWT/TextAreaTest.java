package chapter10_AWT;

import java.awt.Frame;
import java.awt.Label;
import java.awt.BorderLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextAreaTest{
    public static void main(String[] args) {
        Frame f = new Frame("대화창");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        TextArea ta1 = new TextArea("하고싶은말 소ㅑㄹ라\n", 10, 30,
                                    TextArea.SCROLLBARS_NONE);
        
        TextArea ta2 = new TextArea(10, 20);
        ta2.append("널 사랑해ㅔㅔㅔ~ \n");
        
        Panel p1 = new Panel();
        p1.setLayout(new BorderLayout());
        p1.add(new Label("이병재님", Label.CENTER), "North");
        p1.add(ta1, "Center");
        
        Panel p2 = new Panel();
        p2.setLayout(new BorderLayout());
        p2.add(new Label("박용덕님", Label.CENTER), "North");
        p2.add(ta2, "Center");
        
        Panel p3 = new Panel();
        p3.add(p1);
        p3.add(p2);
        
        f.add(p3, "Center");
        f.setSize(500,250);
        f.setVisible(true);
    }
}
