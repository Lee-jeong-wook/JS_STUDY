public class Bus {
    int busNo;
    int passengerCount;
    int money;

    public Bus(int busNo){
        this.busNo = busNo;
    }
    public void takeBus(int money){
        this.money += money;
        this.passengerCount++;
    }
    public void showBus(){
        System.out.println(busNo + "의 승객은" + passengerCount + "명 수익은 " + money);
    }
}
