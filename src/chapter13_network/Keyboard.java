package chapter13_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Keyboard {
    public static String readString(){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        String line = null;
        
        try {
            line = br.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }
        return line;
    }
}
