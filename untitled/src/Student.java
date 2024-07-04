public class Student {

    private int sno;
    private String name;
    private String tel;
    private String add;
    public Student(){

    }
    //매개변수가 있는 생성자를 만들면 기본 생성자를 사용하기 위하여 기본 생성자를 반드시 만들어야 한다.
    public Student(int sno, String name, String tel, String address){
        this.add = address;
        this.name = name;
        this.sno = sno;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public int getSno() {
        return sno;
    }

    public String getAdd() {
        return add;
    }

    public String getTel() {
        return tel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
}
