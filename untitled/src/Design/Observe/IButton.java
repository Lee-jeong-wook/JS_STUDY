package Design.Observe;

public class IButton {
    private String name;
    private IButtonClickListner buttonClickListner;

    public IButton(String buttonName) {
        this.name = name;
    }

    public void click(String clickEvent){
        buttonClickListner.click(this.name + clickEvent);
    }

    public void addListenr(IButtonClickListner buttonClickListner){
        this.buttonClickListner =  buttonClickListner;
    }
}
