package Design;

import Design.Adapter.DecoDeco;
import Design.Decorator.Deconrator;
import Design.Decorator.IService;
import Design.Fecade.FTPClient;
import Design.Proxy.Browser;
import Design.Proxy.BrowserProxy;
import Design.Proxy.IBrowser;
import Design.Strategy.Base64Encoder;
import Design.Strategy.Base64Encoding;
import Design.Strategy.Encoder;
import Design.Strategy.NormalEncoding;

public class Main {
    public static void main(String[] args) {
//        Browser browser = new Browser("www.naver.com");
//`
//        browser.show();
//        browser.show();
//
//        IBrowser browser2 = new BrowserProxy("www.naver.com");
//        browser2.show();
//        browser2.show();
//        browser2.show();

//        IService service = new Deconrator();
//        System.out.println(service.doSomething());
//        IService service1 = new DecoDeco();
//        System.out.println(service1.doSomething());

//        FTPClient ftpClient = new FTPClient("www.naver.com", "/home/content", "my bool");
//        ftpClient.connect();
//        System.out.println(ftpClient.read());
//        ftpClient.write("wed");
//        ftpClient.disconnect();

        Encoder base64Encoder = new Encoder();
        base64Encoder.setEncodingStrategy(new Base64Encoding());
        System.out.println(base64Encoder.getMessage("message"));

        Encoder normalEncoder = new Encoder();
        normalEncoder.setEncodingStrategy(new NormalEncoding());
        System.out.println(normalEncoder.getMessage("message"));
    }
}
