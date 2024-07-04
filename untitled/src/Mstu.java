public class Mstu {
    private int sno;
    private String name;
    private int money;
    Mstu(int sno, String name, int money){
        this.sno = sno;
        this.name = name;
        this.money = money;
    }
    Mstu(int sno, String name){
        this.sno = sno;
        this.name = name;
    }
    public void showStu(){
        System.out.println(name + "님의 남은 돈은 :" + money);
    }

    public String getName() {
        return name;
    }

    public void takeBus(Bus bus){
        bus.takeBus(500);
        this.money -= 500;
    }
    public void takeSubway(Subway subway){
        subway.takeSub(550);
        this.money -= 550;
    }
}
