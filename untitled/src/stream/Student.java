package stream;
//자바 컬렉션에 비교를 위한 인터페이스가 있다
//Compareable
//Comparatator
public class Student implements Comparable<Student>{
    private String name;
    private int age;
    private int money;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMoney() {
        return money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Student(String name, int age, int money){
        this.name = name;
        this.age = age;
        this.money = money;
    }
    public Student(){

    }

    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}
