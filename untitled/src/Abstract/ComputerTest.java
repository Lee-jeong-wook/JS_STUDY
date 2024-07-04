package Abstract;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.turnOn();
        computer.display();
        computer.typing();
        computer.turnOff();

        Notebook notebook = new MyNoteBook();
        notebook.changeBattery();
        notebook.turnOn();
        notebook.display();
        notebook.typing();
        notebook.turnOff();
    }
}
