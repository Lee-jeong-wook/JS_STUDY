package Abstract2;

public class ManualCar extends Car{
    @Override
    public void drive() {
        System.out.println("사람 운전");
    }

    @Override
    public void stop() {
        System.out.println("브레이크 밟아");
    }
}
