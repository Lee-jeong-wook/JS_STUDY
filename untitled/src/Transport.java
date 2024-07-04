public class Transport {
    public static void main(String[] args){
        Mstu kim = new Mstu(20401, "김영호", 10000);
        Bus bus100 = new Bus(100);
        Bus bus200 = new Bus(200);
        Subway sub1 = new Subway(1);
        Mstu yoon = new Mstu(20402, "윤지상", 15000);
        yoon.takeSubway(sub1);
        yoon.showStu();
        sub1.showSub();

        kim.takeBus(bus100);
        kim.showStu();
        bus100.showBus();
        bus200.showBus();
    }
}
