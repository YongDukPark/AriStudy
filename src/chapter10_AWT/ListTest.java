package chapter10_AWT;

import java.awt.Frame;
import java.awt.List;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListTest {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setTitle("자동차 소유 목록");
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        List name = new List(5);
        //위치지정
        name.setLocation(20, 40);
        name.setSize(100, 120);
        name.add("이병재");
        name.add("이인국");
        name.add("박영호");
        
        List car = new List(5);
        car.setLocation(150, 40);
        car.setSize(100, 120);
        car.add("올랜도");
        car.add("산타패");
        car.add("코란도");
        
        f.add(name);
        f.add(car);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
