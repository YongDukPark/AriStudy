package chapter13_network;

import java.net.URL;
import java.net.URLConnection;

public class URLConnectionTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://docs.oracle.com/javase/tutorial/essential/index.html");
            URLConnection con = url.openConnection();
            
            System.out.println("AllowUserInteraction : " + con.getAllowUserInteraction());
            System.out.println("Connect Timeout : " + con.getConnectTimeout());
            System.out.println("Content : " + con.getContent());
            System.out.println("Content type : " + con.getContentType());
            System.out.println("Content length : " + con.getContentLength());
            System.out.println("Content encoding : " + con);
            System.out.println("Data : " + con.getDate());
            System.out.println("Last Modified : " + con.getLastModified());
            System.out.println("Header Fields : " + con.getHeaderFields());
            System.out.println("URL : " + con.getURL());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
