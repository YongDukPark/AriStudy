package chapter11;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CheckboxEvent implements ItemListener{
    Frame fr;
    CheckboxGroup cbGroup;
    Checkbox cbYellow;
    Checkbox cbGreen;
    Checkbox cbPink;
    TextField tf;
    
    CheckboxEvent(){
        fr = new Frame("CheckBoxEvent");
        
        fr.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        //인스턴스 생성
        cbGroup = new CheckboxGroup();
        cbYellow = new Checkbox("Yellow", cbGroup, false);
        cbGreen = new Checkbox("Green", cbGroup, false);
        cbPink = new Checkbox("Pink", cbGroup, false);
        
        //이벤트 발생시 실행
        cbYellow.addItemListener(this);
        cbGreen.addItemListener(this);
        cbPink.addItemListener(this);
        
        //판넬
        Panel pn = new Panel();
        pn.add(cbYellow);
        pn.add(cbGreen);
        pn.add(cbPink);
        
        tf = new TextField("클릭하면 여기에 색상이 표시됩니다.");
        
        fr.add(pn, "North");
        fr.add(tf, "South");
        fr.setSize(300, 200);
        fr.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        //getSource는 체크된 체크박스 객체의 이름 정보를 반환
        Object o = e.getSource();
        //실행값 ava.awt.Checkbox[checkbox0,121,5,53x23,label=Green,state=true]
        
        //체크된 항목과 객체의 이름 정보가 동일할경우 background setting
        if(o == cbYellow){
            tf.setBackground(Color.yellow);
        } else if (o == cbGreen){
            tf.setBackground(Color.green);
        } else {
            tf.setBackground(Color.pink);
        }
    }
    public static void main(String[] args){
        CheckboxEvent ce = new CheckboxEvent();
    }
}
