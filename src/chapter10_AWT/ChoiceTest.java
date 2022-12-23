package chapter10_AWT;

import java.awt.Choice;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChoiceTest {
    public static void main(String[] args) {
        Frame f = new Frame("요일 선택");
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Choice week = new Choice();
        week.add("1");
        week.add("2");
        week.add("3");
        week.add("4");
        week.add("5");
        week.add("6");
        week.add("7");
        
        week.setSize(100,50);
        week.setLocation(100, 70);
        
        f.add(week);
        f.setSize(300,250);
        f.setVisible(true);
        
    }
}
