package Design.Fecade;

public class FileReader {
    public FileReader(String fileName) {
        System.out.println(fileName + "created");
    }

    public void FileConnector() {
        System.out.println("connected");
    }

    public String fileRead() {
        return "content";
    }

    public void disconnect() {
        System.out.println("disconnected");
    }
}
