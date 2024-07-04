package Abstract2;

public class Cartest {
    public static void main(String[] args) {
        Car aiCar = new AICar();
        Car manualCar = new ManualCar();
        aiCar.run();
        manualCar.run();
        Car sonata = new Sonata();
        sonata.run();
    }
}
