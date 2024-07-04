package Abstract2;

public class Sonata extends Car{
    @Override
    public void drive() {
        System.out.println("소나타 운전");
    }

    @Override
    public void stop() {
        System.out.println("소나타 정지");
    }

    @Override
    public void start() {
        System.out.println("소나타 시동");
    }

    @Override
    public void turnOffCar() {
        System.out.println("소나타 시동 끔");
    }
}
