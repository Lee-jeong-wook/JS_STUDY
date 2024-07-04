public class Dog extends Animal {
    private String name;
    // 생성자 안쓰면 JVM이 자동으로 기본생성자를 만든다.
    // 기본생성자는 클래스 이름과 동일하다. 리턴값이 반드시 없음.
    // 생성과 동시에 호출, 상속되지 않음
    // 생성자 오버로드 가능. (메소드 이름 같고, 매개변수 다른 메소드)
    // 매개변수가 있는 생성자를 쓰는 경우에는 자동으로 기본 생성자가 생성되지 않음, 반드시 선언
    public Dog(){

    }
    public Dog(String name){
        this.name = name;
    }
    @Override
    public void act() {
        System.out.println("네발로 뛰어다닌다.");
    }

    @Override
    public  void sound(){
        super.sound();
        System.out.println("멍멍");
    }

}
