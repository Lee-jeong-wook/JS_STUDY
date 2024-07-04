package Design.Fecade;

public class FileWriter {
    public FileWriter(String fileName) {
        System.out.println(fileName + "created2");
    }

    public void FileConnector() {
        System.out.println("connected");
    }

    public void fileWriter(String content) {
        System.out.println(content + "write");
    }

    public void disconnect() {
        System.out.println("disconnected");
    }
}
