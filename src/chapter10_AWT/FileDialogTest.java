package chapter10_AWT;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileDialogTest {
    public static void main(String[] args) {
        Frame f = new Frame("프레임");
        f.setLayout(null);
        
        f.addWindowListener(new WindowAdapter() {
            public void winclose(WindowEvent e) {
                System.exit(0);
            }
        });
        
        FileDialog fd = new FileDialog(f, "파일 열기", FileDialog.LOAD);
        
        f.setSize(300, 200);
        f.setVisible(true);
        
        fd.setDirectory("C:\\myjava");
        fd.setVisible(true);
    }
}
