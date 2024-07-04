package Abstract;

public class MyNoteBook extends Notebook{
    @Override
    public void display() {
        System.out.println("노트북 디스플레이 표시");
    }

    @Override
    public void typing() {
        System.out.println("노트북 타이핑");
    }


    @Override
    public void changeBattery() {
        System.out.println("배터리 교체");
    }
}
