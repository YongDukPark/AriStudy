package chapter10_AWT;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenuTest {
    public static void main(String[] args) {
        Frame f = new Frame("Java Frame");
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        //상단에 바를 만들어준다.
        MenuBar bar = new MenuBar();
        
        //만들어진 메뉴바에 메뉴를 만든다.
        Menu file = new Menu("파일");
        Menu edit = new Menu("편집");
        Menu helpMenu = new Menu("도움말");
        
        //그 메뉴를 클릭했을경우 하단에 보여줄 메뉴 아이템이다.
        //여기 밑에 있는 애들을 객체 형식으로 만들어서 menu에 넣는거다.
        MenuItem open = new MenuItem("열기");
        MenuItem save = new MenuItem("저장");
        MenuItem print = new MenuItem("인쇄");
        MenuItem exit = new MenuItem("종료");
        file.add(open);
        file.add(save);
        //이친구는 구분선같은 친구이다.
        file.addSeparator();
        file.add(print);
        file.addSeparator();
        file.add(exit);
        
        //편집 메뉴바에 추가되는 애들이다.
        edit.add(new MenuItem("잘라내기"));
        edit.add(new MenuItem("붙여넣기"));
        edit.add(new MenuItem("지우기"));
        
        //도움말 메뉴바에 추가되는 애들이다.
        helpMenu.add(new MenuItem("도움말 항목"));
        helpMenu.addSeparator();
        helpMenu.add(new MenuItem("Java Edit 정보"));
        
        //마지막으로 객체로 담아진 메뉴들을 메뉴바에 추가시킨다.
        bar.add(file);
        bar.add(edit);
        bar.add(helpMenu);
        
        //Frame에 메뉴바를 넣는다.
        f.setMenuBar(bar);
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
