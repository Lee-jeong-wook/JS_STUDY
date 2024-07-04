package Abstract2;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("인공지능 운전");
    }

    @Override
    public void stop() {
        System.out.println("인공지능 브레이크");
    }
}
