import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;


public class JavaWebCrawling {
    public static void main(String[] args) throws Exception {
        //String targetUrl = "https://www.marpple.com/kr/product/list/9";
        String targetUrl = "https://pf.kakao.com/_eAGqxb";
        URL url = new URL(targetUrl);

        InputStream is = url.openStream();
        FileOutputStream fos = new FileOutputStream("./src/text2.html");
        int b;
        while ((b = is.read()) != -1) {
            fos.write(b);
        }
        fos.close();
    }
}
