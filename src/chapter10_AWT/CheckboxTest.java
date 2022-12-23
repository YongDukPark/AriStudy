package chapter10_AWT;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxTest {
    public static void main(String[] args) {
        Frame f = new Frame("CheckboxTest");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        Checkbox hobby1 = new Checkbox("게임",true);
        Checkbox hobby2 = new Checkbox("낚시");
        Checkbox hobby3 = new Checkbox("으악");
        
        CheckboxGroup fruit = new CheckboxGroup();
        Checkbox fruit1 = new Checkbox("사과" ,fruit ,false);
        Checkbox fruit2 = new Checkbox("바나나", fruit,false);
        Checkbox fruit3 = new Checkbox("포도",fruit ,false);
        
        Panel p1 = new Panel();
        p1.add(hobby1);
        p1.add(hobby2);
        p1.add(hobby3);
        
        Panel p2 = new Panel();
        p2.add(fruit1);
        p2.add(fruit2);
        p2.add(fruit3);
        
        f.setLayout(new FlowLayout());
        f.add(p1);
        f.add(p2);
        
        f.setSize(300,150);
        f.setVisible(true);
    }
}
