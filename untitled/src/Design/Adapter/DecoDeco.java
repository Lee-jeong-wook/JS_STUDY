package Design.Adapter;

import Design.Decorator.Deconrator;
import Design.Decorator.IService;

public class DecoDeco implements IService{
    IService iService;

    @Override
    public String doSomething() {
        iService = new Deconrator();
        return "최상의" + iService.doSomething();
    }
}

