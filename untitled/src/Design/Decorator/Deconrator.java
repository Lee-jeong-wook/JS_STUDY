package Design.Decorator;

public class Deconrator implements IService{
    IService iService;
    @Override
    public String doSomething() {
        Service service = new Service();
        return "심부름" + service.doSomething();
    }
}
