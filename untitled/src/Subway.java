public class Subway {
    int lineNumber;
    int passengerCount;
    int money;
    public Subway(int lineNumber){
        this.lineNumber = lineNumber;
    }
    public void takeSub(int money){
        this.money += money;
        this.passengerCount++;
    }
    public void showSub(){
        System.out.println(lineNumber + "호선의 승객은" + passengerCount + "명 수익은 " + money);
    }
}
