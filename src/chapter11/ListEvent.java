package chapter11;

import java.awt.Frame;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ListEvent implements ItemListener{
    Frame fr;
    TextField tf;
    List li;
    
    ListEvent(){
        fr = new Frame("List Event");
        
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        tf = new TextField(10);
        
        li = new List();
        li.add("자바");
        li.add("자바스크립트");
        li.add("안드로이드");
        li.add("워드프레스");
        li.addItemListener(this);
        
        fr.add(li, "Center");
        fr.add(tf, "South");
        
        fr.setSize(200, 150);
        fr.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        String item = li.getSelectedItem();
        tf.setText(item);
        tf.setEditable(true);
    }
    
    public static void main(String[] args){
        ListEvent le = new ListEvent();
    }
    
    
}
