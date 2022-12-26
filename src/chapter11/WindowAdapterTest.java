package chapter11;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest extends WindowAdapter{
    Frame f;
    
    public WindowAdapterTest(){
        f = new Frame();
        //클래스 자체를 넘김
        f.addWindowListener(this);
        
        f.setSize(300,200);
        f.setVisible(true);
    }
    
    public void windowClosing(WindowEvent we){
        System.out.println("window Closing");
        System.exit(0);
    }
    //창이 최상단에 올라갔을경우 실행된다.
    public void windowActivated(WindowEvent we){
        System.out.println("window Activated");
    }
    public static void main(String[] args) {
        WindowAdapterTest wet = new WindowAdapterTest();
    }
}
