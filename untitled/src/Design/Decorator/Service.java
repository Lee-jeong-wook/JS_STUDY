package Design.Decorator;

public class Service implements IService{
    public Service() {
        
    }

    @Override
    public String doSomething() {
        return "서비스 오픈";
    }
}
