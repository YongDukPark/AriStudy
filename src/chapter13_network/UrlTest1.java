package chapter13_network;

import java.net.URL;

public class UrlTest1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.oracle.com/technetwork/java/index.html");
            
            //호스트 이름과 포트를 문자열로 반환
            System.out.println("getAuthority() : " + url.getAuthority());
            //url의 content객체 반환    이친구는 문제가 있다 밑에는 다 잘나옴
            //System.out.println("getContent() : " + url.getContent());
            //기본 포트 반환 http는 80임
            System.out.println("getDefaultPort() : " + url.getDefaultPort());
            //포트를 반환 설정 없으면 -1 반환
            System.out.println("getPort() : " + url.getPort());
            //파일명 반환
            System.out.println("getFile() : " + url.getFile());
            //호스트명 반환
            System.out.println("getHost() : " + url.getHost());
            //경로명 반환
            System.out.println("getPath() : " + url.getPath());
            //프로토콜 반환
            System.out.println("getProtocol() : " + url.getProtocol());
            //쿼리를 반환
            System.out.println("getQuery() : " + url.getQuery());
            //참조를 반환
            System.out.println("getRef() : " + url.getRef());
            //사용자 정보 출력
            System.out.println("getUserInfo() : " + url.getUserInfo());
            //URL 문자열로 반환
            System.out.println("toExternalForm : " + url.toExternalForm());
            //URL을 URI로 변환
            System.out.println("toURI() : " + url.toURI());
        } catch (Exception e) {
        }
    }
}
