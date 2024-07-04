package Design.Fecade;

public class FTProtocol {
    public FTProtocol(String host, String path) {
        System.out.println("FTP " + host + "server created and open  path " + path);
    }

    public void connect(){
        System.out.println("FTP connected");
    }

    public void disconnect(){
        System.out.println("FTP disconnect");
    }

    public void moveDirectory(){
        System.out.println("move path");
    }
}

