package chapter11;

import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DoubleClick extends MouseAdapter{
    
    Frame fr;
    TextField tf;
    List li;
    
    DoubleClick(){
        fr = new Frame("DoubleClick Event");
        
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        tf = new TextField(10);
        
        li = new List();
        li.add("자바");
        li.add("자스립트");
        li.add("안드로이드");
        li.add("워드프레스");
        
        li.addMouseListener(this);
        
        fr.add(li, "Center");
        fr.add(tf, "South");
        
        fr.setSize(200, 150);
        fr.setVisible(true);
    }
    
    public void mouseClicked(MouseEvent me){
        if(me.getClickCount() == 2){
            String item = li.getSelectedItem();
            tf.setText(item);
        }
    }
    
    public static void main(String[] args){
        DoubleClick dc = new DoubleClick();
    }
}
