package Abstract;

public class Desktop extends Computer{
    @Override
    public void display() {
        System.out.println("데스크톱 디스플레이 표시");
    }

    @Override
    public void typing() {
        System.out.println("데스크톱 타이핑");
    }
    
    public void turnOff(){
        System.out.println("데스크톱을 끕니다");
    }
    
    
}
