package Abstract;

public abstract class Computer {
    //추상매소드는 구현부가 없는 매소드
    //구현의 책임을 하위 클래스에게 위임할때 추상할 때 추상 클래스를 만든다
    public abstract void display();
    
    public abstract void typing();
    
    //일반 메서드도 가능
    public void turnOn(){
        System.out.println("컴퓨터 켠다");
    }

    public void turnOff(){
        System.out.println("컴퓨터 끈다");
    }
}
