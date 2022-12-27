package chapter13_network;

import java.net.URL;

public class UrlTest1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.oracle.com/technetwork/java/index.html");
            
            //ȣ��Ʈ �̸��� ��Ʈ�� ���ڿ��� ��ȯ
            System.out.println("getAuthority() : " + url.getAuthority());
            //url�� content��ü ��ȯ    ��ģ���� ������ �ִ� �ؿ��� �� �߳���
            //System.out.println("getContent() : " + url.getContent());
            //�⺻ ��Ʈ ��ȯ http�� 80��
            System.out.println("getDefaultPort() : " + url.getDefaultPort());
            //��Ʈ�� ��ȯ ���� ������ -1 ��ȯ
            System.out.println("getPort() : " + url.getPort());
            //���ϸ� ��ȯ
            System.out.println("getFile() : " + url.getFile());
            //ȣ��Ʈ�� ��ȯ
            System.out.println("getHost() : " + url.getHost());
            //��θ� ��ȯ
            System.out.println("getPath() : " + url.getPath());
            //�������� ��ȯ
            System.out.println("getProtocol() : " + url.getProtocol());
            //������ ��ȯ
            System.out.println("getQuery() : " + url.getQuery());
            //������ ��ȯ
            System.out.println("getRef() : " + url.getRef());
            //����� ���� ���
            System.out.println("getUserInfo() : " + url.getUserInfo());
            //URL ���ڿ��� ��ȯ
            System.out.println("toExternalForm : " + url.toExternalForm());
            //URL�� URI�� ��ȯ
            System.out.println("toURI() : " + url.toURI());
        } catch (Exception e) {
        }
    }
}
