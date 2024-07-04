package Design.Proxy;

public class BrowserProxy implements IBrowser{
    private HTML html;
    private String url;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public HTML show() {
//        proxy 사용하는 html 또는 새로 생성하는 html을 리턴하도록 하기
//        한번 생성한 html이 있으면 html을 라턴하고 그렇지ㅏ 않으면 만들기
        if(html == null){
            this.html = new HTML(url);
            System.out.println("browser loading " + url);
        } else{
            //cache를 이용해서 기존 html 로딩
            System.out.println("browser loading from proxy cache " + url);
        }

        return null;
    }
}
