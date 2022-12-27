package chapter13_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class UrlTest2 {
    public static void main(String[] args) {
        try {
            URL page = new URL("http://docs.oracle.com/javase/"
                    + "tutorial/essential/index.html");
            
            //openStream 메소드는 지정된 URL로부터 바이트 단위로 읽는
            //스트림 객체를 반환한다.
            InputStream is = page.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            String path = "C:/test"; //폴더 경로
            File Folder = new File(path);

            // 해당 디렉토리가 없다면 디렉토리를 생성.
            if (!Folder.exists()) {
                    //false return 폴더가 없으니까 ㅠ
                    System.out.println(Folder.exists());
                    Folder.mkdir(); //폴더 생성
                    System.out.println("폴더가 생성완료.");
                    //true return 폴더가 만들어졌으니까 ㅎㅎ
                    System.out.println(Folder.exists());
            } else {
                    System.out.println("폴더가 이미 존재합니다..");
            }
            //경로가 없으면 파일 생성이 안된다. 그럼 만들면 된다
            //ㅎㅎ 위에 코드 추가해놓았다.
            FileWriter fw = new FileWriter("c:/test/urltest.html");
            BufferedWriter bw = new BufferedWriter(fw);
            
            String line = br.readLine();
            
            while(line != null){
                bw.write(line);
                line = br.readLine();
            }
            br.close();
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
