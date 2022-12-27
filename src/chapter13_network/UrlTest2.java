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
            
            //openStream �޼ҵ�� ������ URL�κ��� ����Ʈ ������ �д�
            //��Ʈ�� ��ü�� ��ȯ�Ѵ�.
            InputStream is = page.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            
            String path = "C:/test"; //���� ���
            File Folder = new File(path);

            // �ش� ���丮�� ���ٸ� ���丮�� ����.
            if (!Folder.exists()) {
                    //false return ������ �����ϱ� ��
                    System.out.println(Folder.exists());
                    Folder.mkdir(); //���� ����
                    System.out.println("������ �����Ϸ�.");
                    //true return ������ ����������ϱ� ����
                    System.out.println(Folder.exists());
            } else {
                    System.out.println("������ �̹� �����մϴ�..");
            }
            //��ΰ� ������ ���� ������ �ȵȴ�. �׷� ����� �ȴ�
            //���� ���� �ڵ� �߰��س��Ҵ�.
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
