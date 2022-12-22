package chapter10_AWT;

import java.awt.*;
import java.awt.event.*;

public class BorderLayout {
    public static void main(String[] args) {
        Frame f;
        Button b1, b2, b3, b4, b5;
        
        f = new Frame("난 멋진 버튼");
        
        b1 = new Button("Button1");
        b2 = new Button("Button2");
        b3 = new Button("Button3");
        b4 = new Button("Button4");
        b5 = new Button("Button5");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
//        f.add(b1, BorderLayout.EAST); 이거 왜 안될까...?
//        f.add(b2, BorderLayout.WEST);
//        f.add(b3, BorderLayout.NORTH);
//        f.add(b4, BorderLayout.SOUTH);
//        f.add(b5, BorderLayout.CENTER);
        
        //뭐 중간에 없어도 된당
        f.add(b1, "East");
        f.add(b2, "West");
        f.add(b3, "North");
        f.add(b4, "South");
        f.add(b5, "Center");
        
        f.setSize(300,300);
        f.setVisible(true);
    }
}
