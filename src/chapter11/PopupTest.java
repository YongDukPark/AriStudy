package chapter11;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PopupTest extends MouseAdapter{
    Frame frame;
    PopupMenu pop;
    MenuItem cut, paste, copy;

    public PopupTest() {
        frame = new Frame("Popup Menu");
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        frame.addMouseListener(this);
        
        pop = new PopupMenu();
        
        cut = new MenuItem("오려두기");
        paste = new MenuItem("붙여넣기");
        copy = new MenuItem("복사하기");
        
        pop.add(cut);
        pop.addSeparator();
        pop.add(paste);
        pop.addSeparator();
        pop.add(copy);
        
        frame.add(pop);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
    
    @Override
    public void mousePressed(MouseEvent me) {
        if(me.getModifiers() == InputEvent.BUTTON3_MASK){
            pop.show(frame, me.getX(), me.getY());
        }
    }
    
    public static void main(String[] args){
        PopupTest pt = new PopupTest();
    }
    
}
