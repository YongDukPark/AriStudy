package chapter11;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventTest implements WindowListener{
    
    Frame f;
    public WindowEventTest(){
        f = new Frame("WundiwEvent Test");
        f.addWindowListener(this);
        
        f.setSize(300, 200);
        f.setVisible(true);
    }
    
    
    @Override
    public void windowActivated(WindowEvent e) {
        //창이 최상단에 올라갔을경우 실행된다.
        System.out.println("Window Activated!");
    }
    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
    }
    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
        System.exit(0);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //창이 뒤로 밀렸을경우 실행된다.
        System.out.println("window Deactivated");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //창이 다시 올라갔을때 실행된다 .. 이건 뭐야?
        System.out.println("window Deiconified");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //최소화 버튼 눌렀을경우 실행된다.
        System.out.println("window Iconified");
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //윈도우가 실행됬을경우 실행된다.
        System.out.println("window Opened");
    }
    
    public static void main(String[] args) {
        WindowEventTest wet = new WindowEventTest();
    }
}
