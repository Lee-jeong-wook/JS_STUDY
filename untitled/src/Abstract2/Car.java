package Abstract2;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();
    
    public void start(){
        System.out.println("시동 걸었다");
    }
    
    public void turnOffCar(){
        System.out.println("차량의 시동 끕니다");
    }

    public void run(){
        start();
        drive();
        stop();
        turnOffCar();
    }
}
